package com.hemebiotech.analytics;

import java.util.*;

/**
 * Implementation method for counting occurences symptoms from a a list (symptoms)
 */

public class CountSymptomDataFromList implements ISymptomCounter {

    @Override
    /**
     * @param symptoms which is a simple list of symptoms
     * @return A map (key/value) of symptoms with occurences
     */
    public Map<String, Integer> countSymptom(List<String> symptoms) {
        Map<String, Integer> map = new TreeMap<>();

        if (symptoms != null && !symptoms.isEmpty()) {
            Collections.sort(symptoms);

            for (String symptom : symptoms) {
                if (map.containsKey(symptom)) {
                    map.put(symptom, map.get(symptom) + 1);
                } else {
                    map.put(symptom, 1);
                }
            }
        } else {
            System.out.println("The list of symptoms is empty");
            System.exit(1);
        }
        return map;
    }
}



