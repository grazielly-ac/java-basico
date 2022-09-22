package br.dio.diagramadeclasses.ipod.model;

import java.time.LocalTime;

public class Musicas {

    private String nome;
    private LocalTime duracao;

    public String getNome() {
        return nome;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public Musicas(String nome, LocalTime duracao){
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\n");
        sb.append(nome).append('\'');
        sb.append("| Duração - ").append(duracao);
        return sb.toString();
    }
}
