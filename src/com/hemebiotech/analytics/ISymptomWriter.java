package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Anything that will write symptom data from an ordered map to a file (inside the project)
 */
public interface ISymptomWriter {
    /**
     * @param mapOfSymptoms a map listing of all Symptoms and their occurences with no duplications
     */
    void writeSymptoms(Map<String, Integer> mapOfSymptoms) throws IOException;
}


