package br.dio.bancodigital.service;

import br.dio.bancodigital.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class BancoService {

    private static List<Conta> contas = new ArrayList<>();

    public void adicionarContaBanco(Conta conta){
        contas.add(conta);

    }

    public void removerContaBanco(Conta conta){
        contas.remove(conta);
    }

    public void listarContas(){
        contas.forEach(System.out::println);
    }

}
