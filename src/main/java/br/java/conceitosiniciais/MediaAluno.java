package br.java.conceitosiniciais;

public class MediaAluno {

    public void calcularMediaPonderada(double[][] array) {
        int loop = array.length / 2;
        for(int i = 0; i < loop; i++){
            for(int j = 0; j < array[i].length; j++){
                var resultado = array[i][j] * array[i+1][j];
                System.out.println(resultado);
            }

        }

    }

//Código para testar em main

    /*
    *   double mediaAluno [][] = {
                {8.5, 7.5, 6.0},
                {3,2,5}
        };

        MediaAluno media = new MediaAluno();
        media.calcularMediaPonderada(mediaAluno);
    */
}
