package br.dio.controlefluxo;

import br.dio.controlefluxo.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {


    public static void receberDadaos(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.printf("O segundo parâmetro (%d) deve ser maior que o primeiro (%d)!", e.getParametroDois(), e.getParametroUm());
        }

    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException(parametroUm, parametroDois);
        }
        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++){
            System.out.printf("Imprimindo o número %d%n", (i+1));
        }
    }
}
