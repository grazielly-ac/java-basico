package br.java.abstratasinterfaces.banco;

public class ContaCorrente extends ContaBancaria{

    @Override
    public double calcularSaldo() {
        return saldo - (saldo * (10/100));
    }
}
