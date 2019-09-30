package packageJava;

public class JC_27_BrandMaruti implements JC_42_VehicleInterface{

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
		
		JC_42_VehicleInterface objVehicleMaruti=new JC_27_BrandMaruti();
		objVehicleMaruti.vBreak();
		objVehicleMaruti.vFuel();
		objVehicleMaruti.vGear();
		objVehicleMaruti.vPrice();
	}

}
