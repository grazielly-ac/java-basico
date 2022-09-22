package br.dio.bancodigital.model;

import br.dio.bancodigital.exceptions.SaldoInsuficienteException;
import br.dio.bancodigital.exceptions.ValorNegativoException;

import java.math.BigDecimal;

public interface IOperacoesBancarias {

    BigDecimal sacar(String valorSaque) throws SaldoInsuficienteException, ValorNegativoException;

    BigDecimal depositar(String valorDeposito) throws ValorNegativoException;

    void transferir(String valorTransferencia, Conta contaDestino) throws SaldoInsuficienteException, ValorNegativoException;

    void extratoBancario();
}
