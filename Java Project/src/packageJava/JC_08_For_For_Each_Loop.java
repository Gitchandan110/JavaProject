package packageJava;

public class JC_08_For_For_Each_Loop {

	public static void main(String[] args) {

		int[] marks = { 99, 75, 65, 55, 85 };

		for (int index = 0; index < marks.length; index++) {

			System.out.println(marks[index]);

		}

		String[] Name = { "chandan, Subash, Aman, Dev, Sachin" };

		for (String user : Name) {

			System.out.println(user);
		}

	}

}
