package packageJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Duplicate_Char {

	public static void duplicateTest() {

		String str = "happy boy";
		
	    System.out.println("The string is: " + str);
		System.out.println("The character at o index: " + str.charAt(0));
		System.out.println("The Length of a String: " + str.length());
		
		char[] charray = str.toCharArray();
			
			
		System.out.println("The string is: " + Arrays.toString(charray));
		
		System.out.println("character at o index: " + charray[0]);
	    System.out.println("character at 1 index: " + charray[1]);
	    
		
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println("Character at index :" + i + " is " + " " + charray[i]);
			
			for (int j = i + 1; j < str.length(); j++) {
				
				System.out.println("Character at index :" + j + " is " + " " + charray[j]);
			
				
				if (charray[i] == charray[j]) {
					System.out.print(" character matched ");
					System.out.print(charray[j] + " ");
					
					break;
				}
			}
		}
	}

	public static void main(String[] args) {

		Duplicate_Char dc = new Duplicate_Char();

		dc.duplicateTest();

	}
}