package fileHandling.Config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readingtextFile {
	
	public static void main(String[] args) throws Exception {
		
		
		File f = new File(System.getProperty("user.dir")+"\\src\\fileHandling\\Config\\text.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader reader = new BufferedReader(fr);
		
//		System.out.println(reader.readLine());
		
		
		String line = null;
		while((line=reader.readLine())!=null) {
			
			System.out.println(line);
		}
		reader.close();
		
	}
	
	
		
	
	}
	
	
	


