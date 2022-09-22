package br.dio.bancodigital.model;

import br.dio.bancodigital.exceptions.SaldoInsuficienteException;
import br.dio.bancodigital.exceptions.ValorNegativoException;
import br.dio.bancodigital.service.ContaService;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Conta implements IOperacoesBancarias {

    protected int agencia;
    protected int numero;
    protected BigDecimal saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = sequencial++;
        this.saldo = new BigDecimal("0.0");
        this.cliente = cliente;
    }

    protected BigDecimal getSaldo() {
        return saldo;
    }

    protected int getAgencia() {
        return agencia;
    }

    protected int getNumero() {
        return numero;
    }

    @Override
    public BigDecimal sacar(String valorSaque) throws SaldoInsuficienteException, ValorNegativoException {
        BigDecimal referenciaValor = getBigEntrada(valorSaque);

        if(referenciaValor.compareTo(saldo) > 0){
            throw new SaldoInsuficienteException(referenciaValor, saldo);
        }
        if(referenciaValor.compareTo(BigDecimal.ZERO) < 0){
            throw new ValorNegativoException(referenciaValor);
        }
        if(saldo.compareTo(referenciaValor) > 0){
            saldo = saldo.subtract(referenciaValor);
        }

        return referenciaValor;
    }

    @Override
    public BigDecimal depositar(String valorDeposito) throws ValorNegativoException {
        BigDecimal referenciaValor = getBigEntrada(valorDeposito);

        if(referenciaValor.compareTo(BigDecimal.ZERO) <= 0){
            throw new ValorNegativoException(referenciaValor);
        }else{
            saldo = saldo.add(referenciaValor);
        }

        return referenciaValor;
    }

    @Override
    public void transferir(String valorTransferencia, Conta contaDestino) throws SaldoInsuficienteException, ValorNegativoException {

            sacar(valorTransferencia);
            contaDestino.depositar(valorTransferencia);

    }


    private static BigDecimal getBigEntrada(String valor) {
        BigDecimal referenciaValor = new BigDecimal("0.0");
        try {
            String validaVirgula = valor.replace(",",".");
            referenciaValor = new BigDecimal(validaVirgula);

        }catch (NumberFormatException e){
            System.err.println("O valor deve ser um número!");
        }
        return referenciaValor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return agencia == conta.agencia && numero == conta.numero && saldo.equals(conta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero, saldo);
    }


}
