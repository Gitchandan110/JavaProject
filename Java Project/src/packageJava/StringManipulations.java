package packageJava;

public class StringManipulations {

	/*
	 * String is a collection of different characters which are written within
	 * double quotes
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "The rains have started somewhere";

		String str1 = "The rains Have started somewhere";

		String str2 = "The rains have started heavely";

		System.out.println("The length of the above Strings is: " + str.length());

		System.out.println("The character present at 0th index is: " + str.charAt(0));

		System.out.println("The character present at 5th index is: " + str.charAt(5));

		System.out.println("The index of 1st 's' is: " + str.indexOf("s"));

		System.out.println("The index of 2nd 's' is: " + str.indexOf("s", 9));

		System.out.println("The index of 2nd 's' is: " + str.indexOf('s', str.indexOf('s') + 1));

		System.out.println("The index of 3rd 's' is: " + str.indexOf('s', 16));

		System.out.println("Index of 'started' is :" + str.indexOf("started"));

		System.out.println("is str is equlal to str1 ignore case:" + str.equalsIgnoreCase(str1));

		System.out.println("is str is equlal to str1 :" + str.equals(str1));

		System.out.println("is str is equlal to str2 :" + str.equals(str2));

		System.out.println("Substring of str between 0 to 9 :" + str.substring(0, 9));

		String ch = "  This is chandan  ";

		System.out.println("Before space and after space is removed from ch string :" + ch.trim());

		System.out.println("Now inner space is also removed fromn String:" + ch.replace(" ", ""));

		String Date = "05-02-1980"; // replace to 05/02/1980

		System.out.println(Date.replace("-", "/"));
		
		
		
		
		
		
		
		
	}

}
