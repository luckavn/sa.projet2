package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Anything that will count symptoms data from a List
 * The important part is, the return value from the operation, which is a map, that contains symptoms and occurences (no duplications)
 * The implementation need to order the list
 */
public interface ISymptomCounter {
	/**
	 * @param symptoms which is a list of strings with duplications
	 * @return a map listing of all Symptoms and their occurences with no duplications
	 */
	public Map<String, Integer> countSymptom(List<String> symptoms);
}


