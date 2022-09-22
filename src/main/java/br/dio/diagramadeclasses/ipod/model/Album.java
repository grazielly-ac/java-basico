package br.dio.diagramadeclasses.ipod.model;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Album {

    private String nome;
    private Genero genero;

    private String artista;

    private int anoCriacao;

    private Set<Musicas> musicas = new HashSet<>();
    private Map<String, Set<Musicas>> albumInfo = new HashMap<>();

    public Album(String nome, Genero genero, int anoCriacao, String artista){
        this.nome = nome;
        this.genero = genero;
        this.anoCriacao = anoCriacao;
        this.artista = artista;
    }

    public Set<Musicas> getMusicas() {
        return musicas;
    }
    public Map<String, Set<Musicas>> getAlbumInfo() {
        return albumInfo;
    }

    public Set<Musicas> addMusicas(String nomeMusica, LocalTime duracao){
        musicas.add(new Musicas(nomeMusica, duracao));
        return musicas;
    }

    public Map<String, Set<Musicas>> addAlbum(){

        albumInfo.put(artista, musicas);

        return albumInfo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Album: \n");
        sb.append("Nome - ").append(nome).append("\n");
        sb.append("Gênero - ").append(genero).append("\n");
        sb.append("Artista - ").append(artista).append("\n");
        sb.append("Ano criação - ").append(anoCriacao).append("\n");

        sb.append("Músicas do álbum: \n").append(albumInfo);

        return sb.toString();
    }


}
