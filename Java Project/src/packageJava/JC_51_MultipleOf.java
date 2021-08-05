package packageJava;

public class JC_51_MultipleOf {

	/*
	 * Program to print all the numbers divisible by 3 and 5 for a given number
	 */

	public static void multiple(int n) {

		for (int i = 0; i < n; i++) {

			if (i % 3 == 0 && i % 5 != 0) {

				System.out.println("Multiplication of 3 is :" + i);
			}

			if (i % 3 != 0 && i % 5 == 0) {

				System.out.println("Multiplication of 5 is :" + i);

			}

			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println("Multiplication of 3 and 5 is :" + i);
			}
			
			
			
			if (i%3==0 || i%5==0) {
				
				System.out.println("Multiplication of 3 || 5 is :" + i);
			}

		}

	}

	public static void main(String[] args) {

		JC_51_MultipleOf mo = new JC_51_MultipleOf();
		mo.multiple(20);
	}

}
