package packageJava;

import java.util.ArrayList;
import java.util.Collections;

public class JC_50_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		Collections.sort(cars);
		for (String c: cars) {
			System.out.println(c);
		}

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();

		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		System.out.println(myNumbers);
		Collections.sort(myNumbers);
		for (int i : myNumbers) {
			System.out.println(i);
		}
	}
}
