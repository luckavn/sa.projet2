package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * This file run our program and only call methods. This program is aimed to get symptoms from a list (.txt), count them
 * and then write those symptoms with their occurences (no symptom duplication allowed) into a new file
 *
 * @author Lucas Vannier, AXA France
 * @version 1.0.0
 */

public class RunProgram {

    public static void main(String[] args) throws Exception {

        /**
         * @param String containing args to set objects
         * Read file method
         * */
        System.out.println("Reading file and creating list");
        List<String> symptoms;
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
        symptoms = readSymptomDataFromFile.getSymptoms();

        /**
         * Count symptoms method
         * */
        System.out.println("Counting symptoms and creating TreeMap");
        CountSymptomDataFromList countSymptomDataFromList = new CountSymptomDataFromList();
        Map<String, Integer> mapOfSymptoms = countSymptomDataFromList.countSymptom(symptoms);

        /**
         * Write sorted symptoms list in a new file
         * */
        System.out.println("Writing new file with symptoms and occurences");
        WriteSymptomDataFromMap writeSymptomDataFromMap = new WriteSymptomDataFromMap();
        writeSymptomDataFromMap.writeSymptoms(mapOfSymptoms);

        System.out.println("Thank you for using our program");
    }
}
