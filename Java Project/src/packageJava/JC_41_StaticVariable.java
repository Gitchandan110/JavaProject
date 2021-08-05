package packageJava;

public class JC_41_StaticVariable {

	// Before view this code please view JC_31_Constructor_This.java Program.

	// Instance Variable
	int EmpId;
	String EmpName;
	
	/*As company name and Address is fixed for all employee so we can make it Static variable
	 as it has common value for all the object*/
	

	static String CompanyName="Netsutra";
	static String Address="Ghaziabad";

	// Create Parameterized Constructor (Constructor has same name as class)

	JC_41_StaticVariable(int EmpId, String EmpName) {

		this.EmpId = EmpId;
		this.EmpName = EmpName;
		
	}

	// Created new method "empDetails" inside Class "StaticVariableProgramme"

	public void empDetails() {

		System.out.println( EmpId +" "+ EmpName +" "+  " " + CompanyName +" "+ Address);

	}

	public static void main(String[] args) {

		JC_41_StaticVariable svp = new JC_41_StaticVariable(01, "chandan");
		svp.empDetails();

		JC_41_StaticVariable svp1 = new JC_41_StaticVariable(02, "Ritesh");
		svp1.empDetails();

		JC_41_StaticVariable svp2 = new JC_41_StaticVariable(03, "Dev");
		svp2.empDetails();

	}

}
