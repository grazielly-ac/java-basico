package br.java.herancapolimorfismo.veiculo;

public class Onibus extends Veiculo{

    @Override
    public void desligar() {
        System.out.println("Ônibus desligado!");
        super.desligar();
    }

    @Override
    public void ligar() {
        System.out.println("Ônibus ligado!");
        super.ligar();
    }
}
