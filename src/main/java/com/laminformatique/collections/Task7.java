package com.laminformatique.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        //TODO 7. Écrivez un programme pour vérifier si deux LinkedLists sont égales.
        List<String> fruits= new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Pomme");
        fruits.add("Tomates");

        List<String> legumes= new LinkedList<>();
        legumes.add("Banana");
        legumes.add("Pomme");
        legumes.add("Tomates");
        //legumes.add("Choux");

        // Compare les objects references
        System.out.println(legumes==fruits);

        // Compare des valeurs
        System.out.println(legumes.equals(fruits));
    }


}
