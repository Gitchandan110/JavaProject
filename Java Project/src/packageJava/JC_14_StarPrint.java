package packageJava;

public class JC_14_StarPrint {

	public static void main(String[] args) {
		int n = 7;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}

	}
}
