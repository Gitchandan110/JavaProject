package packageJava;

public class JC_32_MultipleInheriteceInterface implements JC_42_VehicleInterface, JC_34_ShowRoomInterface{
	
	
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
		JC_42_VehicleInterface vh=new JC_32_MultipleInheriteceInterface();
		JC_34_ShowRoomInterface SRInt=new JC_32_MultipleInheriteceInterface();
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
