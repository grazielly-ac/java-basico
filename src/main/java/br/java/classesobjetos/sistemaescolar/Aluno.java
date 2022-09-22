package br.java.classesobjetos.sistemaescolar;


import java.util.Arrays;
import java.util.OptionalDouble;

class Aluno {

    public double calcularMedia(){

        double[] valoresProva = new double[2];
        for(int i = 0; i < valoresProva.length; i++){
            Prova prova = new Prova();
            valoresProva[i] = prova.calcularNotaTotal();
        }

        OptionalDouble media = OptionalDouble.of(Arrays.stream(valoresProva).average().getAsDouble());

        return media.getAsDouble();
    }
}
