package br.dio.bancodigital.service;

import br.dio.bancodigital.exceptions.SaldoInsuficienteException;
import br.dio.bancodigital.exceptions.ValorNegativoException;
import br.dio.bancodigital.model.Conta;

public class ContaService {


        private Conta conta;
        public ContaService(Conta conta){
            this.conta = conta;
        }
        public void sacarValores(String valor){
            try {
                conta.sacar(valor);
                System.out.println("Saque realizado com sucesso!");
            } catch (SaldoInsuficienteException e) {
                System.err.println("Saldo insuficiente para saque!");
            } catch (ValorNegativoException e) {
                System.err.println("O valor deve ser maior que zero!");
            }
        }

        public void depositarValores(String valor){
            try {
                conta.depositar(valor);
                System.out.println("Depósito realizado com sucesso!");
            } catch (ValorNegativoException e) {
                System.err.println("O valor deve ser maior que zero!");
            }

        }

        public void transferirValores(String valor, Conta destino){

            try {
                conta.transferir(valor, destino);
                System.out.println("Transferência realizada com sucesso!\nSaldo atual:");
                conta.extratoBancario();
            }   catch (SaldoInsuficienteException e) {
                System.err.println("Saldo insuficiente para esta transferência!");
            } catch (ValorNegativoException e) {
                System.err.println("O valor deve ser maior que zero!");
            }
        }

        public void extratoConta(){
            conta.extratoBancario();
        }
    }

