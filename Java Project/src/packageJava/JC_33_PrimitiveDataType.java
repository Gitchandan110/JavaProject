package packageJava;

public class JC_33_PrimitiveDataType {

	/*
	 * There are 8 types of primitive data type is in Java 1) boolean 2) long 3)
	 * short 4) char 5) float 6) int 7) byte 8) double
	 */

	// See the primitive data type example

	public static void main(String[] args) {

		// Boolean data type is used to check true or false conditions
		boolean b = false;
		System.out.println("boolean data type valus is :" + b);

		// character data type is used to store any character

		char ch = 'A';
		System.out.println("char data type stroes: " + ch);
		System.out.println("char data type size in bit: " + Character.SIZE + " bit");

		// Integer data type is used to store any integers value

		int i = 123;
		System.out.println("int data type stroes: " + i);
		System.out.println("int data type size in bit: " + Integer.SIZE + " bit");

		// Floating data type is used to store Decimal value

		float fl = 25.99f;
		System.out.println("float data type stroes: " + fl);
		System.out.println("Float data type size in bit: " + Float.SIZE + " bit");

		// Double data type is used to store Decimal value

		double dbl = 25.99;
		System.out.println("double data type stroes: " + dbl);
		// System.out.println("double data type size in bit: " + double.SIZE + " bit");

		// Long data type is used to store Long integer value

		long lng = 2354656776566343232L;
		System.out.println("Long data type stroes: " + lng);
		System.out.println("Long data type size in bit: " + Long.SIZE + " bit");

		/* Short data type can also be used to save memory as byte data type. 
		 * A short is 2 times smaller than an integer
		 */

		short sh = 1000;
		short s= -2000;
		System.out.println("Short data type stroes: " + sh);
		System.out.println("Short data type stroes: " + s);
		System.out.println("Short data type size in bit: " + Short.SIZE + " bit");

	}

}
