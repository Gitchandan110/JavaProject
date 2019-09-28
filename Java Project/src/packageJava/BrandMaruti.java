package packageJava;

public class BrandMaruti implements VehicleInterface{

	@Override
	public void vBreak() {
		// TODO Auto-generated method stub
		
		System.out.println("Power Break");
		
	}

	@Override
	public void vGear() {
		// TODO Auto-generated method stub
		
		System.out.println("6 Gear");
		
	}

	@Override
	public void vFuel() {
		// TODO Auto-generated method stub
		System.out.println("Petrol");
		
	}

	@Override
	public void vPrice() {
		// TODO Auto-generated method stub
		
		System.out.println("Starting Price 4 Lacs");
		
	}
	
	public static void main(String[] args) {
		
		VehicleInterface objVehicleMaruti=new BrandMaruti();
		objVehicleMaruti.vBreak();
		objVehicleMaruti.vFuel();
		objVehicleMaruti.vGear();
		objVehicleMaruti.vPrice();
	}

}
