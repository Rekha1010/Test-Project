package polymorphism;

public class icici extends RBI {
	
	
	public static void main(String[] args) {
		
		icici ic = new icici();
		System.out.println(ic.getHomeLoanROI());
		
		
	}
	
	
//	--Over Riding
	
	
	public int getHomeLoanROI() 
	
	{
		
		System.out.println();
		
			return 9; 
	}
	

}
