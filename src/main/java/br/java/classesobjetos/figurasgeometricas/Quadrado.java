package br.java.classesobjetos.figurasgeometricas;

public record Quadrado (double lado) implements CalcularAreaGeometrica{
    //Records entrou no Java 14, faz algo parecido ao Lombok


    @Override
    public double calcularArea() {
        double areaQuadrado = Math.pow(lado, 2);
        return areaQuadrado;
    }
}
