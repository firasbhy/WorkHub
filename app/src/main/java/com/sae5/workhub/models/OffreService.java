package com.sae5.workhub.models;

public class OffreService {
  private  int id_OffreService;
  private String titre;
  private String description;
  private Catégorie typeService;
  private String livrable;
  private Float prix;
  private boolean desponibilité;

    public int getId_OffreService() {
        return id_OffreService;
    }

    public void setId_OffreService(int id_OffreService) {
        this.id_OffreService = id_OffreService;
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

    public Catégorie getTypeService() {
        return typeService;
    }

    public void setTypeService(Catégorie typeService) {
        this.typeService = typeService;
    }

    public String getLivrable() {
        return livrable;
    }

    public void setLivrable(String livrable) {
        this.livrable = livrable;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public boolean isDesponibilité() {
        return desponibilité;
    }

    public void setDesponibilité(boolean desponibilité) {
        this.desponibilité = desponibilité;
    }

    public OffreService() {
    }

    public OffreService(int id_OffreService, String titre, String description, Catégorie typeService, String livrable, Float prix, boolean desponibilité) {
        this.id_OffreService = id_OffreService;
        this.titre = titre;
        this.description = description;
        this.typeService = typeService;
        this.livrable = livrable;
        this.prix = prix;
        this.desponibilité = desponibilité;
    }
}
