package testPackage;

public class Test2 {

	public void mymethod() {
		System.out.println("Printing from inside mydethod");

	}

	public int caliculation() {
		int value = 5;
		return value;

	}

	public int multiplication() {
		int x = 9;
		int y = 7;
		int z = x * y;
		return z;

	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

	public int sub(int i, int j) {
		int k = i - j;
		return k;

	}

	public String age(int a) {
		String m;
		if (a >= 18) {
			m = "Major";
			if (a >= 60) {
				System.out.println("sr. citizen");
			} else {
				System.out.println("not a sr. citizen");
			}
		}

		else {
			m = "Minor";
		}
		return m;

	}

}
