package packageJava;

public class JC_47_Dog extends JC_46_Abstract_Class{
	
	
	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog Sound is called :Barking");
		System.out.println("Hello All");
		
	}


	@Override
	public void animalColor() {
		// TODO Auto-generated method stub
		System.out.println("Dog Color is Black & White");
		System.out.println("Hello All");
		
	}


	@Override
	public void birdSinging() {
		// TODO Auto-generated method stub
		System.out.println("Koel sound melodies co..co..");
		
	}


	public static void main(String[] args) {
		
		// Create a object
		JC_47_Dog iac = new JC_47_Dog(); 
	
		iac.animalSound();
		iac.animalColor();
		iac.birdSinging();
		iac.sleep();

	}






}
