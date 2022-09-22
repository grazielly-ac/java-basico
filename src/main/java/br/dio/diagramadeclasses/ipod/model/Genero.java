package br.dio.diagramadeclasses.ipod.model;

public enum Genero {
    HEAVY_METAL("Heavy Metal"),
    COUNTRY("Country"),
    FORRÓ("Forró"),
    REGGAE("Reggae"),
    ELETRÔNICA("Eletrônica"),
    BLUES("Blues"),
    POP("Pop"),
    SOUL("Soul"),
    ROCK("Rock"),
    HIP_HOP("Hip Hop"),
    MPB("MPB"),
    JAZZ("Jazz");

    private String nome;
    Genero(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append(nome);
        return sb.toString();
    }
}
