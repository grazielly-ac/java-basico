package br.java.classesobjetos.sistemaescolar;

import java.util.Arrays;
import java.util.Scanner;

class Prova {

    private double[] notas = new double[2];
    private double somaProva;
    private void setSomaProva(double somaProva) {
        this.somaProva = somaProva;
    }
    private double getSomaProva() {
        return somaProva;
    }

    public double calcularNotaTotal(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe as notas da prova: ");
        for(int i = 0; i < notas.length; i++){
            notas[i] = scan.nextDouble();
        }

        setSomaProva(Arrays.stream(notas).sum());

        return getSomaProva();
    }
}
