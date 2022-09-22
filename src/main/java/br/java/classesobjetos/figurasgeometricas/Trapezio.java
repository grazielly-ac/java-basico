package br.java.classesobjetos.figurasgeometricas;

public class Trapezio implements CalcularAreaGeometrica{

    private double baseMaior;
    private double baseMenor;
    private double altura;

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        double areaTrapezio = ((getBaseMaior() + getBaseMenor()) / 2) * getAltura();
        return areaTrapezio;
    }
}
