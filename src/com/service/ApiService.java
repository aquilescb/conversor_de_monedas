package com.service;

import com.exception.ConversorException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Money;
import com.model.MoneyRate;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class ApiService {

    public static Money servidor(String money_base,String money_conversor, int valor_join) throws IOException, InterruptedException {
        try{
            // Cargar la API key desde config.properties
            Properties apiKey = new Properties();
            InputStream input = ApiService.class.getClassLoader().getResourceAsStream("config.properties");

            if (input == null) {
                throw new IOException("Archivo config.properties no encontrado en el classpath.");
            }

            apiKey.load(input);
            String key = apiKey.getProperty("API_KEY");

            if (key == null || key.isBlank()) {
                throw new RuntimeException("API_KEY no encontrada o vacía en config.properties.");
            }

            // Construcción de URL
            String direccion = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + money_base + "/" + money_conversor;
            // Cliente HTTP y solicitud
            HttpResponse<String> response;
            try (HttpClient client = HttpClient.newHttpClient()) {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            }
            // Convertir JSON a objeto Java
            Gson gson = (new GsonBuilder()).
                    setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .setPrettyPrinting()
                    .create();
            String json = response.body();
            MoneyRate miMoneyRate = gson.fromJson(json, MoneyRate.class);
            // Crear objeto Money y devolver

            return new Money(miMoneyRate, valor_join);

        } catch (NumberFormatException var12) {
            System.out.println("Ocurrio un error");
            System.out.println(var12.getMessage());
        } catch (IllegalArgumentException var13) {
            System.out.println("Error de la URI, verifique la direccion.");
        } catch (ConversorException var14) {
            System.out.println(var14.getMessage());
        }
        return null;
    }
}
