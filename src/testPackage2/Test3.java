package testPackage2;

import testPackage.Bank;
import testPackage.Loops;

public class Test3 {

	
	public static void main(String[] args) {
	
		Loops l = new Loops();		
		l.forloop();
		
		Bank b = new Bank();
		b.cashCounter(100, "credit");
		
	}
	
	
	
}
