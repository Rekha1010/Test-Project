package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {

	public static void main(String[] args) throws Exception {
		
		
	
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		driver.findElement(By.className("gLFyf gsfi")).sendKeys("Selenium");
//		
//		1. Absolute xpath
//		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		
		
//		2. Relative xpath
		//Syntax :    //TagName[contains,(@attribut'attributvalue')]
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Selenium");
		
//		driver.findElement(By.xpath("//button[contains(@id,'header-desktop-search-button')]")).click();
		
//		driver.get("https://in.yahoo.com/?p=us");
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
		Thread.sleep(5000);
//		driver.navigate().refresh();
		driver.quit();
		
		
		
		
		// id,Name,class,xpath,css,linktext,partial linktext
		
//		Xpath 
//		1. Absolute xpath
//		2. Relative xpath

	}

}
