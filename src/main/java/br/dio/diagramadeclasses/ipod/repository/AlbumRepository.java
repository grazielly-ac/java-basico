package br.dio.diagramadeclasses.ipod.repository;

import br.dio.diagramadeclasses.ipod.model.Album;


public interface AlbumRepository {


    Album addItens();

    void imprimirAlbums();

    void selecionarItem();

    String playMusica();

}
