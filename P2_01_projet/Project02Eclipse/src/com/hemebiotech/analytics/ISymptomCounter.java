package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 *
 * The implementation does not need to order the list
 *
 */
public interface ISymptomCounter {
	/**
	 * If no data is available, return an empty List
	 * @param symptoms which is a list of strings with duplications
	 * @return a map listing of all Symptoms and their occurences with no duplications
	 */
	public Map<String, Integer> countSymptom(List<String> symptoms);
}


