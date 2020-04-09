package packageJava;

public class JC_49_InheritenceCar {
	

		  protected String brand = "Ford";
		  public void honk() {
		    System.out.println("Tuut, tuut!");
		  }
		

	    public static	class Car extends JC_49_InheritenceCar {
		  private String modelName = "Mustang";
		  
		  
		  public static void main(String[] args) {
		    Car myFastCar = new Car();
		    myFastCar.honk();
		    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
		  }
		}

}

