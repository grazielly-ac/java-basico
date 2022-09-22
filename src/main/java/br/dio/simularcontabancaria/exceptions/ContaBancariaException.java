package br.dio.simularcontabancaria.exceptions;

public class ContaBancariaException extends Exception{

    public ContaBancariaException() {
    }

    public ContaBancariaException(String message) {
        super(message);
    }

    public ContaBancariaException(String message, Throwable cause) {
        super(message, cause);
    }
}
