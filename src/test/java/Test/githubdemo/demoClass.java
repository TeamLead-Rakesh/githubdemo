package Test.githubdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoClass {
	WebDriver driver;
	@Test
	public void m1()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("http://omayo.blogspot.com/");
		 driver.manage().window().maximize();
		//String actualText=driver.findElement(By.id("pah")).getText();
		Assert.assertEquals("PracticeAutomationHere", driver.findElement(By.id("pah")).getText());
		
		 
	     }

	     @AfterMethod
		 public void closure()
		 {
			 driver.close();
		 }

}

	
	

