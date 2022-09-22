package br.dio.bancodigital.model;

public class Cliente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(nome);
        return sb.toString();
    }
}
