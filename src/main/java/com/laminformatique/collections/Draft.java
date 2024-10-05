package com.laminformatique.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Draft {
    public static void main(String[] args) {
        //TODO 5. Écrivez un programme pour fusionner deux ArrayLists en un seul.
        List<String> fruits= new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Pomme");
        fruits.add("Tomates");

        List<String> legumes= new ArrayList<>();
        fruits.add("Persils");
        fruits.add("Pomme de Terre");
        fruits.add("Tomates");
        fruits.add("Choux");

        List<String> mixtes= new ArrayList<>();
        mixtes.addAll(fruits);
        mixtes.addAll(legumes);
        System.out.println(mixtes);

    }
}
