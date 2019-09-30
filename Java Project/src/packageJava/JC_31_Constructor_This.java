package packageJava;

public class JC_31_Constructor_This {

	//Instance Variable
	int EmpId;
	String EmpName;
	String ComanyName;
	
	
	//Create Constructor (Constructor has same name as class)
	
	JC_31_Constructor_This(int EmpId, String EmpName, String ComanyName){
		
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.ComanyName=ComanyName;
		
	}
	
	//Created new method "empDetails" inside Class "StaticVariableProgramme"
	
	public void empDetails() {
		
		System.out.println(EmpId +" "+EmpName+" "+ComanyName);
		
		
	}
	
	
	public static void main(String[] args) {
		
		JC_31_Constructor_This svp= new JC_31_Constructor_This(01, "chandan", "Netsutra");
	    svp.empDetails();
	    
	    JC_31_Constructor_This svp1= new JC_31_Constructor_This(02, "Ritesh", "Netsutra");
	    svp1.empDetails();
	    
	    JC_31_Constructor_This svp2= new JC_31_Constructor_This(03, "Dev", "Netsutra");
	    svp2.empDetails();

	}

}
