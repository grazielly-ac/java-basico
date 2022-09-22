package br.java.herancapolimorfismo.veiculo;

public abstract class Veiculo {

    private boolean ligado;

    public boolean isLigado() {
        return ligado;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }
}
//código main app

/*
*  Veiculo automovel = new Automovel();
        automovel.ligar();
        System.out.println(automovel.isLigado());
        automovel.desligar();
        System.out.println(automovel.isLigado());

        System.out.println();

        Veiculo motocicleta = new Motocicleta();
        motocicleta.ligar();
        System.out.println(motocicleta.isLigado());
        motocicleta.desligar();
        System.out.println(motocicleta.isLigado());

        System.out.println();

        Veiculo onibus = new Onibus();
        onibus.ligar();
        System.out.println(onibus.isLigado());
        onibus.desligar();
        System.out.println(onibus.isLigado());
* */