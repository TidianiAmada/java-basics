package com.laminformatique.collections;

import java.util.*;

public class Task2 {


    public static void main(String[] args) {
        // TODO 2. Écrivez un programme pour supprimer tous les éléments en double d'un ArrayList.
        List<String> fruits= new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Pomme");
        fruits.add("Tomates");
        fruits.add("Bamona");
        fruits.add("Orange");
        Collections.sort(fruits, Comparator.naturalOrder());
        //System.out.println(fruits);



        //TODO

        List<String> legumes= new ArrayList<>();
        legumes.add("Banana");
        legumes.add("Pomme de Terre");
        legumes.add("Tomates");


        Set<String> intersections= new HashSet<>(fruits);
        intersections.retainAll(legumes);

        System.out.println(intersections);
    }
}
