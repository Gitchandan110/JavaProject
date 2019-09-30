package packageJava;

public class JC_30_CreateStaticVariable {
	
	//static variable can be used in another class means outside the class where it has been created.
	
	static int c=10; //static variable
	static boolean test; //default values of boolean is false;
	static String str="chandan";
	public int xyz; //instance variable
	
	public void testStatic() {
		
	System.out.println(c);	
	System.out.println(test);
		
		
	}
	
	public static void main(String[] args) {
		
		JC_30_CreateStaticVariable sv=new JC_30_CreateStaticVariable();
		
		sv.testStatic();
		
	}

}
