package packageJava;

import java.util.Arrays;

public class StringPractice {

	public void CharAtIndex() {

		String str = "HELLO ALL I AM CHANDAN KUMAR";

		String strLC = str.toLowerCase();
		int strlength = strLC.length();
		System.out.println(strLC);
		System.out.println(strlength);
		System.out.println(str.charAt(4));
		for (int i = 0; i < strlength; i++) {
			System.out.println(str.charAt(i));

		}

	}

	public void arrayString() {

		String[] str = { "Hello", "Friend", "i", "am", "Chandan" };

		int length = str.length;
		System.out.println(length);
		System.out.println(str[0]);
		System.out.println(str[1]);

		for (int i = 0; i < str.length; i++) {

			System.out.println("String array at " + i + " " + str[i]);

		}

	}

	public void searchfrmArray() {

		String[] sentence = { "My", "Name", "is", "chandan", "kumar" };

		String search = "chandan";
		boolean x = false;
		int in = 0; // declaration of index variable
		for (int i = 0; i < sentence.length; i++) {

			if (search.equalsIgnoreCase(sentence[i])) {
				in = i;
				x = true;
				break;
			}

			if (x = true) {

				System.out.println(search + " found at index " + in);
			}

			else
				System.out.println(search + " String is not found in the array");
		}

	}
	
	public void splitString() {
		
		String str = "HELLO ALL I AM CHANDAN KUMAR";
		String [] words=str.split(" ");
		
		System.out.println(str);
		System.out.println(Arrays.toString(words));
		
		for (String newWords:words) {
		System.out.println(newWords);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		StringPractice AT = new StringPractice();
		 AT.CharAtIndex();
		 AT.arrayString();
		AT.searchfrmArray();
		AT.splitString();
	}

}
