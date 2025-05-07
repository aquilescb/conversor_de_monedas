package com.util;

import com.exception.ConversorException;
import com.model.Money;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Conversor {

    public static void ejecute()  {
        List<Money> historial = new ArrayList<>();
        Scanner lectura = new Scanner(System.in);
        boolean salida=false;
        System.out.println("-----------------------------------------------");
        System.out.println("Bienvenido/a al programa de conversor de \n Porfavor elige una de las opciones");

        while (!salida) {

            System.out.println("1) Ver el tablero de monedas disponibles");
            System.out.println("2) Convertir tu moneda");
            System.out.println("3) Historal de conversiones");
            System.out.println("4) Salir");
            try {
                System.out.print("Elegí una opción: ");
                int eleccion = lectura.nextInt();
                lectura.nextLine();

                switch (eleccion) {
                    case 1:
                        System.out.println("Tablero generado");
                        Bussineslogic.mostrarMap();
                        break;
                    case 2:

                        try {
                            System.out.println("Ingrese el nombre de tu moneda base");
                            String money_base = lectura.nextLine().trim().toUpperCase(); // limpio y uniforme

                            System.out.println("Ingresa el nombre de la moneda que quieras convertir");
                            String money_conversor = lectura.nextLine().trim().toUpperCase();

                            System.out.println("Ingrese el valor que deseas convertir");
                            int valor_join = Integer.parseInt(lectura.nextLine()); // ← mejor que usar nextInt directamente

                            // Validaciones básicas
                            if (valor_join <= 0) {
                                throw new ConversorException("El monto debe ser mayor que cero.");
                            }

                            Money result = Bussineslogic.conversor_money(money_base, money_conversor, valor_join);
                            if (result == null) {
                                System.out.println("Paises mal ingresado, porfavor revise nuevamente el tablero");
                            } else {
                                System.out.println(result);
                                historial.add(result);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(" Error: Debés ingresar un número válido para el monto.");
                        } catch (Exception e) {
                            System.out.println(" Error inesperado: " + e.getMessage());
                        }
                        break;
                        //CASO 3
                    case 3:
                        Money.listmoney(historial);
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema \n Hasta pronto :)");
                        salida = true;
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Debés ingresar un número entero válido.");
                lectura.nextLine(); // limpiar entrada inválida
            }
        }
    }
}
