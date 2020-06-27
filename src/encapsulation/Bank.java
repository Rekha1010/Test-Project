package encapsulation;

public class Bank {
	
	
	public int accountNo=1234;
	private int pinNo=4455;
	public int balAmount = 100000;
	
	
	public void withdraw(int accNo, int pin, int amount) {
		
		if(accNo==accountNo && pinNo==pin) {
			
			if (amount <= balAmount) {			
			balAmount=balAmount-amount;
			System.out.println("Balance amount is " + balAmount);
			System.out.println("Amount Withdrawn succesffully");			
		}else {
			System.out.println("Insuffcicnet Balance");
		}		
	} else
		
		System.out.println("invalid Details");
	}




	public int getPinNo() {
		return pinNo;
	}




	public void setPinNo(int accNo, int oldPin, int newPin) {
		
		if(accNo==accountNo && oldPin==pinNo) {
			
			pinNo =newPin;
			System.out.println("Pin number updated usccessfully");
		}else {
			System.out.println("Incorrect Old Pin");
		}
		
		
		
			
		
	}
	
	
	
	

}
