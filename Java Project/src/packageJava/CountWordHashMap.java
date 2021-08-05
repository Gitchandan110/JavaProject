package packageJava;

import java.util.Arrays;
import java.util.HashMap;

public class CountWordHashMap {

	public static void countWord() {

		String str = "Java Program to Find the Occurrence of Words in a String using HashMap Java Program to Find";

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		String[] splitWord = str.split(" ");

		// System.out.println(Arrays.toString(splitWord));

		for (String wordList : splitWord) {

			// If wordList is present in hashMap,
			if (hashMap.containsKey(wordList)) {

				// incrementing it's count by 1
				hashMap.put(wordList, hashMap.get(wordList) + 1);

			}

			else {
				// If wordList is not present in hashMap,
				// putting this wordList to hashMap with 1 as it's value
				hashMap.put(wordList, 1);

			}

			System.out.println(hashMap);
		}

	}

	public static void main(String[] args) {
		CountWordHashMap cwhm = new CountWordHashMap();
		cwhm.countWord();

	}

}
