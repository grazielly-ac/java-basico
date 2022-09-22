package br.java.conceitosiniciais;

public class TrabalhandoComNumeros {

    public void imprimirInteiros(){
        int i = 10;
        do{
            System.out.printf("%d | ", i);
            i++;
        }while(i <= 25);
    }

    public void somarNumeros(){
        int soma = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                soma += i;

            }
        }
        System.out.printf("%nTotal - %d%n", soma);
    }

    public void somarAte(){
        int soma = 0, somaNumeros = 0;

        while(somaNumeros < 100){
            somaNumeros += soma++;

            System.out.printf("%d | ", soma);
        }
        System.out.println();
    }

    public void tabuadaNumeroNove(){
        int numero = 9;
        for(int i = 0; i <= 10; i++){
            int multiplicacao = numero * i;
            System.out.printf("%d * %d = %d%n", numero, i, multiplicacao);
        }
    }

    //Código para teste em main

    /*
    *   TrabalhandoComNumeros trabalhando = new TrabalhandoComNumeros();
        trabalhando.imprimirInteiros();
        trabalhando.somarNumeros();
        trabalhando.somarAte();
        trabalhando.tabuadaNumeroNove();
    * */
}
