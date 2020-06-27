package polymorphism;

public class citybank extends RBI {
	
	
	public static void main(String[] args) {
		
		citybank ic = new citybank();
		System.out.println(ic.getHomeLoanROI());
		
		
	}
	
	
//	--Over Riding
	
	
	public int getHomeLoanROI() 
	
	{
		
		System.out.println();
		
			return 9; 
	}
	

}
