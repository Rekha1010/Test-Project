package fileHandling.Config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class writingTextFiles {
	
	
	public static void main(String[] args) throws Exception {
		
		
		
		File f = new File (System.getProperty("user.dir")+"\\src\\fileHandling\\Config\\text.csv");		
		
		FileWriter fw = new FileWriter(f);
		
	
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		
		writer.write("Firest Line");
		writer.newLine();
		writer.write("Second Line");
		writer.newLine();
		writer.write("Third Line");
		writer.newLine();
	
		System.out.println("File Created");
		
		
		for(int i = 0;i<5;i++) {
			for(int j=0;j<5;j++) {

				int num = (int) (Math.random()*100);
				writer.write(num+",");
			}
			writer.newLine();
			
		}
		
		
		
		writer.close();
		
		
		
		
		
	}

	
	

}
