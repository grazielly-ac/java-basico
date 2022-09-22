package br.dio.simularcontabancaria.service;

import br.dio.simularcontabancaria.exceptions.ContaBancariaException;
import br.dio.simularcontabancaria.model.OperacoesBancarias;
import br.dio.simularcontabancaria.exceptions.SaldoInsuficienteException;
import br.dio.simularcontabancaria.exceptions.ValorNegativoException;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;


public final class ContaBancariaServiceImpl {

    private OperacoesBancarias operacoesBancarias = new OperacoesBancarias();

    public void realizarSaque() {
        System.out.println("Informe o valor para saque: ");
        try {
            operacoesBancarias.sacar();
            System.out.println("Saque realizado com sucesso!\n");
        }  catch (ValorNegativoException e) {
            System.err.println("valor deve ser maior que zero!");
        } catch (SaldoInsuficienteException e) {
            System.err.println("saldo insuficiente para esta transação!");
        }

    }

    public void realizarDeposito() {
        System.out.println("Informe o valor para depósito: ");
        try {
            operacoesBancarias.depositar();
            System.out.println("Depósito realizado com sucesso!\n");
        } catch (ValorNegativoException e) {
            System.err.println("valor deve ser maior que zero!");
        }

    }

    public void realizarTransferenciaSaldo(ContaBancariaServiceImpl conta) {
        System.out.println("Informe o valor para saque e transferência: ");
        try {
            operacoesBancarias.transferirSaldo(conta);
            System.out.println("Transferência realizada com sucesso!\n");
        } catch (ContaBancariaException e) {
            System.err.println("Erro - " + e.getMessage());
        }
    }

    public void imprimirSaldo(){
        Locale brasil = Locale.forLanguageTag("pt-BR");
        BigDecimal valorMoeda = operacoesBancarias.consultarSaldo();
        NumberFormat brasilNumberFormat = NumberFormat.getNumberInstance(brasil);
        String moeda = brasilNumberFormat.format(valorMoeda);

        System.out.printf("%s%n", moeda);
    }
}
