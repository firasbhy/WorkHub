package com.sae5.workhub.models;

public class Catégorie {
    private  int id_catégorie;
    private String titre;
    private String description;

    public int getId_catégorie() {
        return id_catégorie;
    }

    public void setId_catégorie(int id_catégorie) {
        this.id_catégorie = id_catégorie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catégorie(int id_catégorie, String titre, String description) {
        this.id_catégorie = id_catégorie;
        this.titre = titre;
        this.description = description;
    }
}
