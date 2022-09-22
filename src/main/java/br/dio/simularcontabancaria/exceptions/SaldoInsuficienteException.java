package br.dio.simularcontabancaria.exceptions;

import java.math.BigDecimal;

public class SaldoInsuficienteException extends Exception{

    private BigDecimal valor;
    private BigDecimal saldo;

    public SaldoInsuficienteException(BigDecimal valor, BigDecimal saldo){
        this.valor = valor;
        this.saldo = saldo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
