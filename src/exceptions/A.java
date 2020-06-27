package exceptions;

public class A {

	
	public static void main(String[ ] args) {
	    
		int[] myNumbers = {1, 2, 3};
		
//	    System.out.println(myNumbers[10]); // error!
	    
	    
	    
	    try {
	    	System.out.println("100");
	    	
	    	System.out.println(myNumbers[10]); 
	    	System.out.println("1");
	    	System.out.println("2");
	    	
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
	    
	    
	    finally {
	        System.out.println("The 'try catch' is finished.");
	      }
	    
	    
	    System.out.println("im out of try catch");
	    
	  }
	
	
}
