package packageJava;

public class StringBufferTest {

	public static void main(String[] args) {
		
	//String buffer is used to create Mutable (Modifiable) String	
		
		StringBuffer sb=new StringBuffer ("QA");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		sb.append("Chandan");
		
		System.out.println(sb);
		
		sb.insert(2, "Netsutra");
		
		System.out.println(sb);
		
		sb.replace(2, 9, "Professional");
		
		System.out.println(sb);
		
		sb.delete(2, 15);
		
		System.out.println(sb);
		
		sb.append("Kumar");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);

	}

}
