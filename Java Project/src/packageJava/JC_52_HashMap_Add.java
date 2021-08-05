package packageJava;

import java.util.HashMap;

public class JC_52_HashMap_Add {

	public static void main(String[] args) {
		// Creating a set using the HashSet class
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Vivaan");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(103, "chandan");
		System.out.println("Initial list of elements: " + map);
		System.out.println("map "+ map);
		// key-based removal
		map.remove(100);
		System.out.println("Updated list of elements: " + map);
		// value-based removal
		map.remove(101);
		System.out.println("Updated list of elements: " + map);
		// key-value pair based removal
		map.remove(102, "Rahul");
		System.out.println("Updated list of elements: " + map);
		
	}

}
