package packageJava;

/*
How many types of logical operators are supported by Java?

Ans: Java supports three types of logical operators. They are as follows:

&& AND operator
|| OR operator
! NOT operator*/

public class Operator_01 {

	public static void programme1() {
		
		int x = 1, y = 2, z = 5;
		if (x == 1 || x > y || x > z) {
			System.out.println("programme1:One");
		}
		if (x == y || y == 2 || z == 5) {
			System.out.println("programme1:Two");
		}
		if (x == y || y == z || z == x) {
			System.out.println("programme1:Three");
		}
	}
	
	public static void programme2() {
		
		
		int x = 200, y = 50, z = 100; 
		 if(x > y && y > z){ 
		   System.out.println("programme2:Hello"); 
		} 
		 if(z > y && z < x){ 
		  System.out.println("programme2:Java"); 
		} 
		 if((y+200) < x && (y+150) < z){ 
		  System.out.println("programme2:Hello Java"); 
		 } 
		} 
		
	
	
public static void main(String[] args) {
	
	Operator_01 op=new Operator_01();
	op.programme1();
	op.programme2();
	
	
}
}
