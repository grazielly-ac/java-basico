package br.dio.simularcontabancaria.model;

import br.dio.simularcontabancaria.exceptions.ContaBancariaException;
import br.dio.simularcontabancaria.exceptions.SaldoInsuficienteException;
import br.dio.simularcontabancaria.exceptions.ValorNegativoException;
import br.dio.simularcontabancaria.service.ContaBancariaServiceImpl;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class OperacoesBancarias {

    private ContaBancaria contaBancaria = new ContaBancaria();
    private Scanner scan;

    public BigDecimal sacar() throws ValorNegativoException, SaldoInsuficienteException {

        BigDecimal valorSaque = entradaUsuario();

        if(valorSaque.compareTo(contaBancaria.getSaldo()) > 0){
            throw new SaldoInsuficienteException(valorSaque, contaBancaria.getSaldo());
        }

        if(valorSaque.compareTo(BigDecimal.ZERO) <= 0){
            throw new ValorNegativoException(valorSaque);
        }
        contaBancaria.setSaldo(contaBancaria.getSaldo().subtract(valorSaque));

        return valorSaque;
    }

    public BigDecimal consultarSaldo(){

        return contaBancaria.getSaldo();
    }

    public BigDecimal depositar() throws ValorNegativoException {
        BigDecimal valorDeposito = entradaUsuario();

        if(valorDeposito.compareTo(BigDecimal.ZERO) <= 0){
            throw new ValorNegativoException(valorDeposito);
        }

        contaBancaria.setSaldo(contaBancaria.getSaldo().add(valorDeposito));
        return valorDeposito;
    }

    public void transferirSaldo(ContaBancariaServiceImpl contaBancaria1) throws ContaBancariaException {

        try {
            sacar();
            contaBancaria1.realizarDeposito();
        }  catch (ValorNegativoException e) {
            throw new ContaBancariaException("valor deve ser maior do que zero!");
        } catch (SaldoInsuficienteException e) {
            throw new ContaBancariaException("saldo insuficiente para esta transação!");
        }


    }

    private BigDecimal entradaUsuario() {
        BigDecimal valorEntrada = new BigDecimal("0.0");
        String valor = "";
        try {

            scan = new Scanner(System.in);
            valor = scan.next("(-)?([0-9])+([,.])?([0-9])+");

            valorEntrada = new BigDecimal(valor);


        } catch (InputMismatchException e) {
            System.out.println("O valor informado deve ser um número!");

        }catch (NumberFormatException e){
            String novaEntrada = valor.replace(",",".");
            valorEntrada = new BigDecimal(novaEntrada);
        }

        return valorEntrada;
    }
}
