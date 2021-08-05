package packageJava;

import java.util.Arrays;

public class StringSplit {

	public void splitMyString() {

		String str = "Riste me to hum tumhare baap lagte hai";

		char[] charstr = str.toCharArray();

		String[] Word = str.split(" ");
		
		// System.out.println(Arrays.toString(Word));
		
		for (String splitWord : Word) {
			
			// System.out.println(splitWord);

			for (int i = 0; i < str.length(); i++) {

				for (int j = i + 1; j < str.length(); j++) {

					if (charstr[i] == charstr[j]) {

						System.out.println(charstr[j] + " ");
						
						break;
					}
				}
			}
		}
	}

	public void stringReverse() {

		String str = "Hello All How are you";

		char[] myChar = str.toCharArray();
		int j = str.length();
		for (int i = j; i > 0; i--) {
			System.out.println(myChar[i - 1]);
		}

	}

	public void wordReverse() {

		String str = "Hello All How are you";
		String[] splitWord = str.split(" ");
		int i = splitWord.length;
		System.out.println(i);
		System.out.println(splitWord[0]);
	//	System.out.println(Arrays.toString(splitWord));

		for (int j = i; j > 0; j--) {
			System.out.println(splitWord[j - 1]);

		}

	}

	public static void main(String[] args) {

		StringSplit myPractice = new StringSplit();
		//  myPractice.splitMyString();
		// myPractice.stringReverse();
		myPractice.wordReverse();
	}

}
