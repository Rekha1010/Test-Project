package testPackage;

public class Test1 {

	public static void main(String[] args) {
		
		Test2 t = new Test2(); 
		
		t.mymethod();
	
		int value = t.caliculation();
		System.out.println(value);
		
		int z = t.multiplication();
		System.out.println(z);
		t.add(10, 14);
		t.add(14, 18);
        int k = t.sub(99, 79);
        System.out.println(k);
  
      
        String m = t.age(40);
        System.out.println(m);
        
        
        
	}

}
