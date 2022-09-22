package br.java.herancapolimorfismo.veiculo;

public class Motocicleta extends Veiculo{

    @Override
    public void desligar() {
        System.out.println("Motocicleta desligada!");
        super.desligar();
    }

    @Override
    public void ligar() {
        System.out.println("Motocicleta ligada!");
        super.ligar();
    }
}
