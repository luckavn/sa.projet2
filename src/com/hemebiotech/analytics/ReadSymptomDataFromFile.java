package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implementation method for reading symptoms from a file (symptoms.txt)
 */

public class ReadSymptomDataFromFile implements ISymptomReader {
	private String filepath;

	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	@Override
	/**
	 * @return A List of String with Symptoms in it
	 */
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (FileNotFoundException e) {
				System.out.println("Cannot find file named symptoms.txt");
			} catch (IOException e) {
					e.printStackTrace();
			}
			finally {
				Collections.sort(result);

			}
		}
		return result;
	}
}
