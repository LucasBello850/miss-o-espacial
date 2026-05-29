package com.nasa.centralnasa.model;

public class Foguete {

    private String nome;
    private double combustivel;
    private double temperatura;
    private String status;

    public Foguete(
            String nome,
            double combustivel,
            double temperatura,
            String status) {

        this.nome = nome;
        this.combustivel = combustivel;
        this.temperatura = temperatura;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getStatus() {
        return status;
    }
}