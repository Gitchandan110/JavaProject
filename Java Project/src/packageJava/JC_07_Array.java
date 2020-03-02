package packageJava;

public class JC_07_Array {

	public static void main(String[] args) {
		
	
		
		int[] ckarray= {2,4,6,8};
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	
		
		
		//0,1,2,3, are index number of array.
		
		System.out.println(ckarray[0]);
		System.out.println(ckarray[1]);
		System.out.println(ckarray[2]);
		System.out.println(ckarray[3]);
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
				

		int index=0;
		while (index < 4) {
		
		System.out.println(ckarray[index]);
		
		index++;
	}
		
	/*	Index 4 is not available in car so Array
		Index Out of Bounds Exception will occur*/
		
		System.out.println(cars[4]);
		System.out.println(ckarray[4]);

}
}