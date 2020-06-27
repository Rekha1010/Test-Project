package testPackage;

public class A {

	public static void main(String[] args) {
		
	// For Non Static method, we have to create a object and call the method 
		A a1 = new A ();
		a1.add();
		a1.add();
		a1.add();
		a1.add();
		a1.add();
		a1.add(1,2);
		a1.add(3,6);
		a1.Text();
		System.out.println();
		int value = a1.Text();
		System.out.println(value);
	
		// for static method, we can call directly method without creating an  object
		m1();
	}
	
	
	// Non Static Method Creation 
	 public void add() {
		 
	 int a = 5;
	 int b = 7;
	 int c = a+b;
	 
	 System.out.println(c);	 
 }
	 
 	
	// Non Static Method Creation with parameterization 
		 public void add(int a , int b) {	 
		 
		 int c = a+b;
		 
		 System.out.println(c);	 
	 }
	 
	 
	 
	 
	 
	 
		// Static Method Creation 
	 public static void m1() {
		 int x =1;
		 int y = 5;
		 int z = x*y;
		 
	 
	 
	 System.out.println(z);	 
 }
	 
	 
	 public int Text () {
		  int value = 10;
		  return value;
		 
	 }
	 
	 
	 	 
	 
	 
	 
 
}
