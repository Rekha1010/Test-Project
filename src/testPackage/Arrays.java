package testPackage;

public class Arrays {

	public static void main(String[] args) {
		
		
		Arrays a = new Arrays();
		a.twoDimensianlArray();
		
		

		
}

	
		
	public void singledimensinalArray(){
			
		
		int[] i = {10,20,30,40};
		
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++) {
		
			System.out.println(i[j]);
			
		}
		
		String[] month = {"Jan","Feb","March","Apr","May"};
		System.out.println(month.length);
		
		
		for(int k=0;k<month.length;k++) {
			
			System.out.println(month[k]);
			
		}
		
		
	}

		
	
	public void twoDimensianlArray() {
		
		
		int rows =3;
		int cols =3;
		
		int[][] table= new int[rows][cols];
		
		table[0][0]=21;
		table[0][1]=34;
		table[0][2]=50;
		
		table[1][0]=33;
		table[1][1]=44;
		table[1][2]=55;
		
		table[2][0]=78;
		table[2][1]=89;
		table[2][2]=90;
		
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
				System.out.print(" " +table[i][j]);			
				
		}
			System.out.println("  ");
		}
		
	}
	
		
	
	}
	
	
