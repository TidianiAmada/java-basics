package com.laminformatique.poo;

import java.time.LocalDate;

public class Vehicule {

    int vitesse;
    public LocalDate dateCreation;
    private String marque;
     public void move(){
        vitesse=120;
        System.out.println("Vehicule is moving");
    };
    public void move(int vitesse){

        System.out.println("Vehicule is moving at " + vitesse);
    };
    protected void stop(){};

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }



    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "vitesse=" + vitesse +
                ", dateCreation=" + dateCreation +
                ", marque='" + marque + '\'' +
                '}';
    }
}
