package packageJava;

public class SingleLevelInheritence extends multiplication {



	public void add() {

	System.out.println("Add");
	
	}

	public void sub() {

		System.out.println("sub");

	}

	public void multiply() {

		System.out.println("mul");
	}

	public static void main(String[] args) {

		SingleLevelInheritence a = new SingleLevelInheritence();
		a.add();
		a.sumSLI(5, 7);
		a.sub();
		a.subtrationSLI(6, 2);
		a.multiply();
		a.multiplySLI(6, 5);

	}

}
