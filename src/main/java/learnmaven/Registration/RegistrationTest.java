package learnmaven.Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import learnmaven.setup.Setup;

public class RegistrationTest extends Setup{
	
public static WebDriver driver;
	
	
	@Test
	public void Resistration() throws Exception  {
		driver.findElement(By.linkText("REGISTER")).click();
	
	  //driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	  
	  
	 // driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("John");
	 // driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("Doe");
	 // driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("02233456");
	 // driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("JOhnDoe");
	// driver.findElement(By.xpath("//input[contains(@name,'address1')]")).sendKeys("278A Queen Street");
	// driver.findElement(By.xpath("//input[contains(@name,'address2')]")).sendKeys("Petone");
	// driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("LowerHutt");
		
		
		
		
	  
	  }
  
 

}


