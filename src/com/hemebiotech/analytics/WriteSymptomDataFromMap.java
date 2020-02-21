package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Implementation method for writing ordered TreeMap into a new file (result.out)
 */

public class WriteSymptomDataFromMap implements ISymptomWriter {

    @Override
    /**
     * @param mapOfSymptoms which is a map (key/value) of symptoms with occurences
     * @return An empty void
     */
    public void writeSymptoms(Map<String, Integer> mapOfSymptoms) throws IOException {
        String nextLine = System.getProperty("line.separator");
        String path = "result.out";
        FileWriter writer = new FileWriter(path);

        if (mapOfSymptoms != null && !mapOfSymptoms.isEmpty()) {

            for (Map.Entry<String, Integer> entry : mapOfSymptoms.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.write(nextLine);
            }
            System.out.println("The file is available at " + path);
            writer.close();
        } else {
            writer.close();
        }
    }
}

