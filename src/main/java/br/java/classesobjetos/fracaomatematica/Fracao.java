package br.java.classesobjetos.fracaomatematica;

public class Fracao {

    private double numerador;
    private double denominador;

    void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    void setDenominador(double denominador) {
        this.denominador = denominador;
    }


    public double getNumerador() {
        return numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void recebeFracao(double numerador, double denominador){
        this.setNumerador(numerador);
        this.setDenominador(denominador);
    }

    public static String multiplicaFracao(Fracao um, Fracao dois){
        Fracao resultado = new Fracao();
        resultado.setNumerador(um.getNumerador() * dois.getNumerador());
        resultado.setDenominador(um.getDenominador() * dois.getDenominador());

        return String.format("%.2f | %.2f", resultado.getNumerador(), resultado.getDenominador());
    }

}

//Código main em App.java

/*
*  Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numerador e o denominador da primeira fração: ");
        Fracao fracaoUm = new Fracao();
        fracaoUm.recebeFracao(scan.nextDouble(), scan.nextDouble());

        System.out.println("Informe o numerador e o denominador da segunda fração: ");
        Fracao fracaoDois = new Fracao();
        fracaoDois.recebeFracao(scan.nextDouble(), scan.nextDouble());

        System.out.printf("Numerador um = %.2f | Denominador um = %.2f %n", fracaoUm.getNumerador(),fracaoUm.getDenominador() );
        System.out.printf("Numerador dois = %.2f | Denominador dois = %.2f %n", fracaoDois.getNumerador(),fracaoDois.getDenominador() );

        System.out.println(Fracao.multiplicaFracao(fracaoUm, fracaoDois));
* */