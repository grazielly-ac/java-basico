package br.java.classesobjetos.figurasgeometricas;

public class Triangulo implements CalcularAreaGeometrica{

    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        double resultado = getBase() * getAltura();
        return resultado;
    }
}
