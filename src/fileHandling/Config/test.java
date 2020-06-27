package fileHandling.Config;

import java.io.FileInputStream;// FileInputStream is predefined class that is present in the java.IO package 
import java.util.Properties; // Properties is predfined class that is present in the java.Utill package

public class test {

	public static void main(String[] args) throws Exception {
		
		
		Properties prop = new Properties() ;
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\fileHandling\\Config\\cofig.properties");
		prop.load(fis);
		
		System.out.println(prop.get("websiteurl"));
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));
		
		System.out.println(System.getProperty("user.dir")); // Systtem.getproperty is a predifined method will return the project folder Path
		
		
		
		

	}

}
