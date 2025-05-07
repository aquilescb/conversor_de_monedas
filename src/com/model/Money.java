package com.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Money {
    private final String base;
    private final String target;
    private final double montoConvertido;
    private final double monto;
    private final LocalDateTime timestamp;


    public Money(MoneyRate rate, double monto) {
        this.base = rate.base_code();
        this.target = rate.target_code();
        this.montoConvertido = monto * rate.conversion_rate();
        this.monto=monto;
        this.timestamp = LocalDateTime.now();
    }

    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "El valor del monto ingreasdo: "+monto+" "+base+ " corresponde al valor final de --> "+montoConvertido+" " +target+"\nConversion realizada --> ["+ timestamp.format(formato)+"]";
    }
    public static void listmoney(List<Money> historial){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Historial de conversiones");
        System.out.printf("%-12s %-15s %-10s %-20s %-13s %-20s\n",
                "Iteración", "Moneda Base", "Monto", "Moneda Convertida", "Convertido", "Fecha y Hora");
        System.out.println("------------------------------------------------------------------------------------------");

        int i = 1;
        for (Money registro : historial) {
            System.out.printf("%-12d %-15s %-10.2f %-20s %-13.2f %-20s\n",
                    i++,
                    registro.base,
                    registro.monto,
                    registro.target,
                    registro.montoConvertido,
                    registro.timestamp.format(formato)
            );
        }
    }
}
