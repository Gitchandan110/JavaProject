package packageJava;

public class string {
	
	public static void main(String[] args) {
		
		String s1=new String("Computer");
		System.out.println("s1 is :"+s1);
		
		
		String s2="My Computer";
		System.out.println("s2 is :"+s2);
		
		
    	String s3=new String("Laptop");
    	System.out.println("s3 is :"+s3);
        String s4=s3.toUpperCase();
	    System.out.println("s4 is :"+s4);	
	    String s5=s3.toLowerCase();
	    System.out.println("s5 is :" +s5);
	    
	    
	    String s6="Congratulations";
	    System.out.println("s6 is:"+ s6);
	    int g = s6.indexOf("g");
	    System.out.println("Index of g is:"+ g);
	    int a = s6.indexOf("a");
	    System.out.println("Index of a is:"+ a);
	  
		
		
	}

}
