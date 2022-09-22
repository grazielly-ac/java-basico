package br.java.classesobjetos.sistemaescolar;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Turma {

    private List<Aluno> aluno;

    public double calcularMedia(){

        double[] mediaNotasAlunos = new double[3];
        for (int i = 0; i < mediaNotasAlunos.length; i++){
            Aluno aluno = new Aluno();
            mediaNotasAlunos[i] = aluno.calcularMedia();
        }


        OptionalDouble mediaTurma = Arrays.stream(mediaNotasAlunos).average();
        double mediaTurmaFinal = mediaTurma.getAsDouble();

        return mediaTurmaFinal;
    }
}

//Teste código main em App

/*
*
        Turma turma = new Turma();
        System.out.printf("Média da turma - %.2f", turma.calcularMedia());
* */