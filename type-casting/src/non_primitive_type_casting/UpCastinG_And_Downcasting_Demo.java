package non_primitive_type_casting;

public class UpCastinG_And_Downcasting_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting
		
		Organization organization=new Staff();
		
		
		//downcasting
		
		Staff staff=(Staff)organization;
		 staff.report();
		

	}

}
