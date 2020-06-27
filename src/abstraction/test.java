package abstraction;

public class test {	
	
	public static void main(String[] args) {	
		
		String broweser = "FF";
		
		WebDriver driver = null;
		
		if(broweser.equalsIgnoreCase("FF"))
			
		{
			driver = new FF();	
		}
		else if(broweser.equalsIgnoreCase("Chrome"))
			 
		{
			driver = new chrome();
		}
		
		else if(broweser.equalsIgnoreCase("IE"))
			 
		{
			driver = new IE();
		}
		
		
		driver.getUrl("Google Page opened");
		driver.type();
		driver.click();
		
		
		
		
		
		
		
		
		
		
//		String browser = "chrome";
//		
//		
//		WebDriver driver = null;
//		
//		if(browser.equalsIgnoreCase("FF")) {
//			
//			driver = new FF();			
//			
//		}		
//		else if(browser.equalsIgnoreCase("chrome")) {
//				
//			driver = new chrome();		
//		}
//		
//		
//		driver.getUrl("https://google.com");
//		driver.type();
//		driver.click();
		

	}

}
