package com.laminformatique.poo;

import java.util.ArrayList;
import java.util.List;

public class VehiculeServiceImpl implements VehiculeService{

    List<Vehicule> vehicules= new ArrayList<>();
    @Override
    public void addVehicule(Vehicule vehicule) {
        vehicules.add(vehicule);
        System.out.println(vehicules);
    }


}
