package testPackage;

public class Loops {

	public static void main(String[] args) {

		Loops w = new Loops();
		w.nestedForLoop();

	}

	public void whileloop() {

		int i = 0;

		while (i > 10) {
			i++;
			System.out.println(i);

		}

		System.out.println("Im out of while loop");

	}

	public void dowhile() {

		int i = 0;

		do {
			i++;
			System.out.println(i);
		} while (i > 10);
	}

	public void forloop() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i);
			System.out.println("I Increamted ");

		}

	}

	public void nestedForLoop() {

		for (int i = 0; i < 10; i++) {

			System.out.println("I value is "+i);
			for (int j=i+1; j<10;j++) {
			
				System.out.println("j value is "+j);
				
				
			}
			
			
			

		}

	}

}