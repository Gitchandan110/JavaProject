package packageJava;

public class JC_40_StringSplit {

	public static void main(String[] args) {
		
		
      //Split the characters from the below sentence
		
	 String sentence=new String("This_is_My_New_Home_and_new_car");	
		
	//To store the split character needs to create an array of string
		
	 String splitSentence[]= sentence.split("_");
		
	/* Now need to print each split words stored in an array. 
	There are multiple words which has to print one by one so 
	need to create a for loop */	
	
	for (int i=0; i<splitSentence.length;i++) {
		
		System.out.println(splitSentence[i]);
		System.out.println("Hello All");
		
		
	}
	
	//Example 2
	 String sentence1=new String("I live in Indirapuram Ghaziabad Utaar Pradesh India");	
	 String splitSentence1[]=sentence1.split(" ");
	 for (int i=0;i<splitSentence1.length;i++) {
	 System.out.println(splitSentence1[i]);
	 System.out.println("Hello All");
		 
	 }

	}

}
