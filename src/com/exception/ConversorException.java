package com.exception;

public class ConversorException extends RuntimeException {
    private final String mensaje;

    public ConversorException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
