package br.dio.simularcontabancaria.model;

import java.math.BigDecimal;

public final class ContaBancaria {

    private BigDecimal saldo;

    public ContaBancaria(){
        saldo = new BigDecimal("0.0");
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
