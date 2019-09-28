package packageJava;

public class instanceVariable {
	
	//Instance variable is created outside the method (arithmetics()) but inside the class(instanceVariable).
	
	int a; //Instance variable number: default value is always 0
	boolean b; //Instance variable boolean: default value is always false
	int x=10; 
	int y=20;
	int z=x+y;
	int c=x-a; //x=10, a=0;
	
	
	public void arithmetics() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(c);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		instanceVariable iv= new instanceVariable();
		
		iv.arithmetics();
		
	}

}
