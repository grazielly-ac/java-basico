package br.dio.controlefluxo.exception;

public class ParametrosInvalidosException extends Exception{

    private int parametroUm;
    private int parametroDois;

    public ParametrosInvalidosException(int parametroUm, int parametroDois){
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }

    public int getParametroDois() {
        return parametroDois;
    }

    public int getParametroUm() {
        return parametroUm;
    }
}
