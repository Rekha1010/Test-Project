package encapsulation;

public class test {

	public static void main(String[] args) {
		
		
		Bank bk =new Bank();	
		System.out.println(bk.getPinNo());
		bk.setPinNo(1234, 4455, 9900);		
		bk.withdraw(1234, 9900, 100);
		System.out.println(bk.getPinNo());

	}

}
