package br.java.herancapolimorfismo.prepararbebida;

public class Preparador {

    public void prepararBebida(Bebida bebida){
        System.out.println("Preparando - " + bebida.getNome());
        bebida.preparar();

        if(bebida.isAquecer()){
            System.out.println("Aquecendo a bebida - " + bebida.getNome());
        }

        System.out.println("Bebida preparada com sucesso!");
    }
}
//Codigo main app

/*
*  Preparador preparador = new Preparador();

        LeiteQuente leiteQuente = new LeiteQuente();
        preparador.prepararBebida(leiteQuente);
        System.out.println();

        Refrigerante refrigerante = new Refrigerante();
        preparador.prepararBebida(refrigerante);
* */