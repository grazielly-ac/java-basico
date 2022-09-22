package br.java.herancapolimorfismo.pontodimensional;

import br.java.herancapolimorfismo.veiculo.Veiculo;

public class Ponto2D {

    protected double x;
    protected double y;

    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + " | y: " + y;
    }
}

//Código main em app

/*
* Ponto2D ponto2d = new Ponto2D(10,20);
        System.out.println(ponto2d);

        Ponto2D ponto3d = new Ponto3D(15,2, 5);
        System.out.println(ponto3d);
*
* */
