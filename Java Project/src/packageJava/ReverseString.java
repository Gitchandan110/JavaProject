package packageJava;

public class ReverseString {
	
	
	public void reverseString() {
		
		String str="chandan kumar";
	//	StringBuilder sb=new StringBuilder(str);
	//	System.out.println(sb.reverse());
		
		StringBuffer sbf=new StringBuffer(str);
		System.out.println(sbf.reverse());
	    
	}	


	public static void main(String[] args){
		
		ReverseString rs=new ReverseString();
		rs.reverseString();
		
	}
	
	

}
