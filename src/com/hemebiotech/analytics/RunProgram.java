package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class RunProgram {

	/**
	 * This file run our program and only call methods. This program is aimed to get symptoms from a list (.txt), count them
	 * and then write those symptoms with their occurences (no symptom duplication allowed) into a new file
	 */

	public static void main(String args[]) throws Exception {
		/**Read*/
		List<String> symptoms;
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		symptoms = readSymptomDataFromFile.getSymptoms();

		System.out.println(symptoms);

		/**Count*/
		CountSymptomDataFromList countSymptomDataFromList = new CountSymptomDataFromList();
		Map<String, Integer> mapOfSymptoms = countSymptomDataFromList.countSymptom(symptoms);

		System.out.println(mapOfSymptoms);

		/**Write*/
		WriteSymptomDataFromMap writeSymptomDataFromMap = new WriteSymptomDataFromMap();
		writeSymptomDataFromMap.writeSymptoms(mapOfSymptoms);

		System.out.println("Thank you for using our program");
	}
}
