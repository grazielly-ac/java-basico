package br.dio.simularcontabancaria.exceptions;

import java.math.BigDecimal;

public class ValorNegativoException extends Exception{

    private BigDecimal valor;

    public ValorNegativoException(BigDecimal valor){
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
