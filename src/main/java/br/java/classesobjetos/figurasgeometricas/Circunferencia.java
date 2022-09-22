package br.java.classesobjetos.figurasgeometricas;

public class Circunferencia implements CalcularAreaGeometrica{

    private final double PI = Math.PI;
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        double areaCircunferencia = PI * Math.pow(getRaio(), 2);
        return areaCircunferencia;
    }
}
