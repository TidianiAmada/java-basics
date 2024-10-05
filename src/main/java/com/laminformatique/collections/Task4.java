package com.laminformatique.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {


    public static void main(String[] args) {
        // TODO 4. Écrivez un programme pour trouver la fréquence de chaque élément dans un ArrayList.
        // Création d'un ArrayList avec des éléments
        List<String> list = new ArrayList<>();
        list.add("pomme");
        list.add("orange");
        list.add("pomme");
        list.add("banane");
        list.add("orange");
        list.add("pomme");

        // Appel de la méthode pour trouver la fréquence des éléments
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Afficher la fréquence de chaque élément
        for (String item : list) {
            // Si l'élément est déjà dans la map, augmenter sa fréquence
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.getOrDefault(item,0) + 1);
            } else {
                // Sinon, l'ajouter avec une fréquence de 1
                frequencyMap.put(item, 1);
            }
        }
        System.out.println(frequencyMap);
    }
}
