package testPackage;

public class Test {

	public static void main(String[] args) {
	
		Bank b = new Bank ();
		int amount = b.cashCounter(5000, "Credited");
		MobileNetwork m = new MobileNetwork();
		m.SMS(amount);
		
		b.cashCounter(5000, "Credited");
		m.SMS(amount);
		
		
		Bank bk = new Bank();
		amount =	bk.cashCounter(5000, "Credited");
		MobileNetwork mn = new MobileNetwork();
		mn.SMS(amount);
		
 
	}

}
