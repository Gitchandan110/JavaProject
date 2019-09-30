package packageJava;

public class JC_39_StringSeperator {
	
	
	// Separate characters,special characters and numbers from the given strings.

			 public static void main(String[] args) {
				 
			  String str2 = "ae@io#b$u123";
			  
			  System.out.println("Characters are : "+ str2.replaceAll("[^a-zA-Z]", ""));
			  
			  
			  System.out.println("Numbers are : "+ str2.replaceAll("[^0-9]", ""));
			  
			  
			  System.out.println("Special characters are : "+ str2.replaceAll("[a-zA-Z0-9]", ""));
			 }

	

}


