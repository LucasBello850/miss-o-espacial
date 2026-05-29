package com.nasa.centralnasa.model;

import java.util.List;

public class Missao {

    private String nome;

    private Foguete foguete;

    private List<String> satelites;

    public Missao(
            String nome,
            Foguete foguete,
            List<String> satelites) {

        this.nome = nome;
        this.foguete = foguete;
        this.satelites = satelites;
    }

    public String getNome() {
        return nome;
    }

    public Foguete getFoguete() {
        return foguete;
    }

    public List<String> getSatelites() {
        return satelites;
    }
}