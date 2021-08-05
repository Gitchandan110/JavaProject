package packageJava;
public class ReverseWord {  
public static String reverseWord(String str){  
    String [] words=str.split("\\s");  
    
  
   System.out.println(); 
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  



public static void main(String[] args) {  
    System.out.println(ReverseWord.reverseWord("my name is khan"));  
   
    }  
}  