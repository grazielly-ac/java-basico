package br.java.conceitosiniciais;

public class Fibonacci {

    public void calcularFibonacci(int number){
        int j = 1;
        int k = 0;

        for(int i = 0; i <= number; i++){
            int valor = j + k;
            j = k;
            k = valor;

            System.out.println(k);
        }
    }

    //Código main

    /*
    *   Fibonacci fb = new Fibonacci();
        fb.calcularFibonacci(15);
    * */
}
