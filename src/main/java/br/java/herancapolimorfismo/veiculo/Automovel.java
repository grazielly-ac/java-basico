package br.java.herancapolimorfismo.veiculo;

public class Automovel extends Veiculo{

    @Override
    public void desligar() {
        System.out.println("Automóvel desligado!");
        super.desligar();
    }

    @Override
    public void ligar() {
        System.out.println("Automóvel ligado!");
        super.ligar();
    }



}
