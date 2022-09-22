package br.dio.bancodigital.model;

import java.util.List;

public class Banco {

    private List<Conta> contas;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Banco{");
        sb.append("contas=").append(contas);
        sb.append('}');
        return sb.toString();
    }
}
