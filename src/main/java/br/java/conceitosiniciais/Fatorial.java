package br.java.conceitosiniciais;

public class Fatorial {

    public static int fatorial(int number){
        int fatorial = 1;
        for(int i = number; i >= 1; i--){
            fatorial *= i;
        }
        System.out.println(fatorial);
        return fatorial;
    }

    private static int fatorialRecursivo(int number){
        if(number <= 1)
            return 1;

        return number * fatorialRecursivo(number - 1);

    }

    public void calculaFatorialRecursivo(int number){
        for(int i = 0; i <= number; i++){
            System.out.printf("%d! = %d%n", i, fatorialRecursivo(i));
        }
    }

    //Código main

    /*
    *    Fatorial fatorial = new Fatorial();
        Fatorial.fatorial(5);
        fatorial.calculaFatorialRecursivo(5);
    *
    * */
}
