package com.laminformatique.collections;

import java.util.*;

public class Task1 {

    // TODO practices on Java Collections
    // TODO 1- Creer un arraylist, ordonner la liste et
    // ensuite afficher les élements encommun


    // TODO POO ou Java Concurency


    public static void main(String[] args) {

        List<String> fruits= new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Pomme");
        fruits.add("Tomates");
        fruits.add("Bamona");
        fruits.add("Orange");
        Collections.sort(fruits, Comparator.naturalOrder());
        System.out.println(fruits);


    }

    private Comparator<String> comparator(String a, String b){
        return Comparator.comparing(s -> a.length()>b.length());
    }
}