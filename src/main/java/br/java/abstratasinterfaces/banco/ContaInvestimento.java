package br.java.abstratasinterfaces.banco;

public class ContaInvestimento extends ContaBancaria{

    @Override
    public double calcularSaldo() {
        return saldo + (saldo * (5/100));
    }
}
