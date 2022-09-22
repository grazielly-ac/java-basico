package br.dio.bancodigital.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extratoBancario() {
        StringBuffer sb = new StringBuffer("Conta Poupança\n");
        sb.append(String.format("Titular: %s%n", this.cliente.getNome()));
        sb.append(String.format("Agência: %d%n", this.agencia));
        sb.append(String.format("Número: %d%n", this.numero));
        sb.append(String.format("Saldo: %.2f%n", this.saldo));

        System.out.println(sb);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Conta Poupança [");
        sb.append(" Agência - ").append(agencia);
        sb.append(" | Número - ").append(numero);
        sb.append(" | Cliente - ").append(cliente);
        sb.append(']');
        return sb.toString();
    }
}
