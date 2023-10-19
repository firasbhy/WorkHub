package com.sae5.workhub.models;

public class Solde {
    private  int id;
    private  float valuer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValuer() {
        return valuer;
    }

    public void setValuer(float valuer) {
        this.valuer = valuer;
    }

    public Solde() {
    }

    public Solde(int id, float valuer) {
        this.id = id;
        this.valuer = valuer;
    }
}
