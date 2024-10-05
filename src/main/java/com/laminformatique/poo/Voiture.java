package com.laminformatique.poo;

/**
 * Inheritance
 * Encapsulation
 * Polymorphism
 * Abstraction
  */

public class Voiture extends Vehicule {
    String transmission; // AUTOMATIQUE, MANUELLE
    String cartubant ; // GASOIL, ESSENCE

    public static void main(String[] args) {
        Vehicule voiture= new Voiture();
        voiture.move();
    }
}
