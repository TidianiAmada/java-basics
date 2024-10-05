package com.laminformatique.poo;

import java.time.LocalDate;

public class AstractionDraft {



    public static void main(String[] args) {
        VehiculeService service = new VehiculeServiceImpl();
        Vehicule vehicule= new Vehicule();
        vehicule.vitesse=120;
        vehicule.dateCreation= LocalDate.now();
        service.addVehicule(vehicule);
    }
}
