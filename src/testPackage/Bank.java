package testPackage;

public class Bank {
	
	
	int amount = 10000;
	
	
	
	public int cashCounter (int amt,String action) {
		
		
		if(action.equalsIgnoreCase("WithDraw")) {
			amount= amount-amt;
			System.out.println("amount Withdrawn successfully");
		}
		
		else if (action.equalsIgnoreCase("Credit")){
			amount = amount+amt;
			System.out.println("amount Credited successfully");
		}
	
		
		return amount;
	}
	
	

	
	//1. public
	//2. private
	//3. default
	//4. protected 
	
}
