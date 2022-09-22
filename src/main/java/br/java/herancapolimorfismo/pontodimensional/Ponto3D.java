package br.java.herancapolimorfismo.pontodimensional;

public class Ponto3D extends Ponto2D{

    private double z;

    public Ponto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ponto 3D - ");
        sb.append(super.toString());
        sb.append(" | z: ").append(z);
        return sb.toString();
    }
}
