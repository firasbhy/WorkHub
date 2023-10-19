package com.sae5.workhub.models;

public class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private  Long numTel;

    public Utilisateur() {
    }

    public Utilisateur(int id, String nom, String prenom, String email, Long numTel) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numTel = numTel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getNumTel() {
        return numTel;
    }

    public void setNumTel(Long numTel) {
        this.numTel = numTel;
    }
}
