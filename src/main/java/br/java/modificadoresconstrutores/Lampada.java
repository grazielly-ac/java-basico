package br.java.modificadoresconstrutores;

public class Lampada {


    private boolean ligada;
    private String mensagem;
    public Lampada(){
        ligada = true;
        mensagem = "Lâmpada ligada";
    }

    public boolean isLigada(){
        ligada = true;
        this.mensagem = "Lâmpada ligada";
        return ligada;
    }

    public boolean isDesligada(){
        ligada = false;
        this.mensagem = "Lâmpada desligada";
        return ligada;
    }

    public String imprimir(){
        return mensagem;
    }

}

//Código em main

/*
*  Lampada lampada = new Lampada();
        System.out.println(lampada.imprimir());
        lampada.isDesligada();
        System.out.println(lampada.imprimir());
        lampada.isLigada();
        System.out.println(lampada.imprimir());
*
* */
