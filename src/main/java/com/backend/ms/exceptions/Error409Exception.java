package com.backend.ms.exceptions;

public class Error409Exception extends RuntimeException {
    public Error409Exception(String mensaje) {
        super(mensaje);
    }
}