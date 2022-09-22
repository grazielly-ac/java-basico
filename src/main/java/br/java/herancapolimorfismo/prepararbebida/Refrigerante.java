package br.java.herancapolimorfismo.prepararbebida;

public class Refrigerante extends Bebida{

    public Refrigerante(){
        super("Refrigerante", false);
    }

    @Override
    void preparar() {
        System.out.println("Pegando o copo\nColocando gelo no copo\nColocando o refrigerante");
    }
}
