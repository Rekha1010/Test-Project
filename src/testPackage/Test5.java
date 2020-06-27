package testPackage;

public class Test5 {
	public static void main(String[] args) {
		
	
Test5 gt = new Test5 ();
gt.testa();
gt.testb();
gt.testc();
gt.testd();
}

public void testa() {
	int ta = 0;
	while (ta<7) {
		ta++;
		System.out.println(ta);
	}
	
	System.out.println("out of loop");
}


public void testb() {
	int tb = 0;
	do { tb++;
	System.out.println(tb);
	} while (tb<7);	 }

public void testc() {
	for (int tc =0; tc <9; tc++) {
	System.out.println(tc);
	System.out.println();
	}	
	
}
	
	
	
	
	
	
	public void testd() {
		
		System.out.println("testd");
		
		for (int td = 0; td < 10; td++) {
			if(td ==4) {
				break ;
			}
			
			System.out.println(td);
			
		}
	}
	
	
	
}


 