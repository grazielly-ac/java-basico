package br.java.abstratasinterfaces.banco;

public abstract class ContaBancaria {

    protected double saldo;

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }
    public void sacar(double valor){
        if(valor <= saldo && valor > 0){
            saldo -= valor;
        }
    }
    public void transferir(double valor, ContaBancaria conta){
        sacar(valor);
        conta.depositar(valor);
    }

    public abstract double calcularSaldo();
}

/*
*  ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1000);
        System.out.println(contaCorrente.calcularSaldo());
        contaCorrente.sacar(200);
        System.out.println(contaCorrente.calcularSaldo());

        ContaInvestimento contaInvestimento = new ContaInvestimento();
        contaInvestimento.depositar(2000);
        System.out.println(contaInvestimento.calcularSaldo());
        contaInvestimento.transferir(600, contaCorrente);
        System.out.println(contaInvestimento.calcularSaldo());

        System.out.println(contaCorrente.calcularSaldo());
*
* */