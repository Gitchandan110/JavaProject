package packageJava;

public class multipleInheriteceInterface implements VehicleInterface, ShowRoomInterface{
	
	
	@Override
	public void delhi() {
		// TODO Auto-generated method stub
		System.out.println("Delhi");
		
	}

	@Override
	public void noida() {
		// TODO Auto-generated method stub
		System.out.println("Noida");
	}

	@Override
	public void ghaziabad() {
		// TODO Auto-generated method stub
		System.out.println("Ghaziabad");
	}

	@Override
	public void gurgaon() {
		// TODO Auto-generated method stub
		System.out.println("Gurgaon");
	}

	@Override
	public void vBreak() {
		// TODO Auto-generated method stub
		System.out.println("Break");
	}

	@Override
	public void vGear() {
		// TODO Auto-generated method stub
		System.out.println("Gear");
	}

	@Override
	public void vFuel() {
		// TODO Auto-generated method stub
		System.out.println("Fuel");
	}

	@Override
	public void vPrice() {
		// TODO Auto-generated method stub
		System.out.println("Price");
	}
	
	

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		VehicleInterface vh=new multipleInheriteceInterface();
		ShowRoomInterface SRInt=new multipleInheriteceInterface();
		vh.vBreak();
		vh.vFuel();
		vh.vGear();
		vh.vPrice();
		SRInt.ghaziabad();
		SRInt.gurgaon();
		SRInt.noida();
		SRInt.delhi();
	}

}
