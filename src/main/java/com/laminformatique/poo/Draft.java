package com.laminformatique.poo;

import java.time.LocalDate;

public class Draft {

    public static void main(String[] args) {

        Vehicule vehicule= new Vehicule();
        vehicule.vitesse=120;
        vehicule.dateCreation= LocalDate.now();
        //vehicule.marque="AirBus";
        vehicule.setMarque("AirBus");
        Avion avion =new Avion();
        avion.move();
        avion.move(120);

    }
}
