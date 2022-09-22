package br.dio.diagramadeclasses.ipod;

import br.dio.diagramadeclasses.ipod.service.impl.AlbumServiceImpl;

import java.util.Scanner;

public class Ipod {

    private static AlbumServiceImpl album = new AlbumServiceImpl();

    private static void adicionarMusicas(){
        album.addItens();
    }

    private static void imprimirAlbum(){
        album.imprimirAlbums();
    }

    private static void selecionarMusica(){
        album.selecionarItem();
    }

    private static void controleIpodMusica(){
        System.out.println(album.playMusica());
    }

    public static void acessoIpod(){
        Ipod.adicionarMusicas();
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe:\n1 - Imprimir ábuns\n2 - Selecionar música\n3 - Controle música");

        int opcao = scan.nextInt();
        while(opcao != 0){
            switch (opcao){
                case 1 -> Ipod.imprimirAlbum();
                case 2 -> Ipod.selecionarMusica();
                case 3 -> Ipod.controleIpodMusica();
                default -> System.out.println("Valor inválido");

            }
            System.out.println("Informe:\n1 - Imprimir ábuns\n2 - Selecionar música\n" +
                    "3 - Controle música\n0 - Sair");
            opcao = scan.nextInt();
        }
        System.out.println("Voltando ao menu...");
    }

}
