package packageJava;

public class JC_26_BrandBMW implements JC_42_VehicleInterface{
	
	@Override
	public void vBreak() {
		// TODO Auto-generated method stub
		System.out.println("Power Break");
	}

	@Override
	public void vGear() {
		// TODO Auto-generated method stub
		System.out.println("8");
	}

	@Override
	public void vFuel() {
		// TODO Auto-generated method stub
		System.out.println("Diesel");
	}

	@Override
	public void vPrice() {
		// TODO Auto-generated method stub
		System.out.println("50 Lacs");
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JC_42_VehicleInterface objVehicleBMW = new JC_26_BrandBMW();
		
		objVehicleBMW.vBreak();
		objVehicleBMW.vFuel();
		objVehicleBMW.vGear();
		objVehicleBMW.vPrice();
		
		
	}


}
