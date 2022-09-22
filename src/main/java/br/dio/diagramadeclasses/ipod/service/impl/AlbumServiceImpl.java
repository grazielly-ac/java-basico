package br.dio.diagramadeclasses.ipod.service.impl;

import br.dio.diagramadeclasses.ipod.model.Album;
import br.dio.diagramadeclasses.ipod.model.Genero;
import br.dio.diagramadeclasses.ipod.model.Musicas;
import br.dio.diagramadeclasses.ipod.service.AlbumService;

import java.time.LocalTime;
import java.util.*;

public class AlbumServiceImpl implements AlbumService {

    private Album album;
    private boolean entrada;

    public String getMostrarMusica() {
        return mostrarMusica;
    }

    public void setMostrarMusica(String mostrarMusica) {
        this.mostrarMusica = mostrarMusica;
    }

    private String mostrarMusica;
    private StringBuffer nomeMusica;

    private boolean isEntrada() {
        return entrada;
    }
    private void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }

    @Override
    public Album addItens() {

        album = new Album("The black", Genero.HEAVY_METAL, 1991, "Metállica");
        album.addMusicas("Enter Sandman", LocalTime.of(5, 32));
        album.addMusicas("Sad but true", LocalTime.of(5, 25));
        album.addMusicas("Holier Than Thou", LocalTime.of(3, 48));
        album.addMusicas("The unforgiven", LocalTime.of(6, 27));
        album.addMusicas("Wherever I may roam", LocalTime.of(6, 44));
        album.addMusicas("Don't tread on me", LocalTime.of(4, 0));
        album.addMusicas("Of wolf and man", LocalTime.of(4, 17));
        album.addMusicas("The god that failed", LocalTime.of(5, 9));
        album.addMusicas("My friend of misery", LocalTime.of(6, 50));
        album.addMusicas("The struggle within", LocalTime.of(3, 54));

        album.addAlbum();

        return album;
    }

    @Override
    public void imprimirAlbums() {
        System.out.printf("%s%n", album.getAlbumInfo());
    }

    @Override
    public void selecionarItem() {
        System.out.println("Informe o nome da música que deseja: ");
        Scanner scan = new Scanner(System.in);
        nomeMusica = new StringBuffer(scan.nextLine());

        for (Map.Entry<String, Set<Musicas>> entrada : album.getAlbumInfo().entrySet()) {
            entrada.getValue().forEach(v -> {
                if(v.getNome().equalsIgnoreCase(nomeMusica.toString())){
                    setEntrada(true);
                    setMostrarMusica(v.getNome());
                }
            });
        }

        if(isEntrada()){
            System.out.println(tocarMusica(getMostrarMusica()));
        }else {
            System.out.println("Música desconhecida - " + nomeMusica.toString());
        }

    }

    private String tocarMusica(String nome) {

        return "Tocando música - " + nome;

    }
    @Override
    public String playMusica() {
        System.out.println("Informe:\n1 - pausar música\n2 - continuar música\n3 - parar música");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        String retorno;
        switch (opcao) {
            case 1 -> retorno = "Música pausada";
            case 2 -> retorno = "Tocando música";
            case 3 -> retorno = "Fim do play";
            default -> retorno = "Não existe essa opção!";
        }

        return retorno;

    }

}
