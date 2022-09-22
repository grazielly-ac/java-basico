package br.java.herancapolimorfismo.prepararbebida;

public class LeiteQuente extends Bebida{

    public LeiteQuente() {
        super("Leite quente", true);
    }

    @Override
    void preparar() {
        System.out.println("Pegando um copo\nColocando o leite no copo");
    }
}
