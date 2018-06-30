package maven.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	WebDriver driver;
	WebElement txtUsername;
	WebElement txtPassword;
	WebElement btnLogin;
	
	public  Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void login() {
		
		txtUsername=driver.findElement(By.name("userName"));
		txtPassword= driver.findElement(By.name("password"));
		btnLogin= driver.findElement(By.name("login"));
		
		txtUsername.sendKeys("Test");
		txtPassword.sendKeys("Test");
		btnLogin.click();
		
	}
	
	
	public void submitform(String a, String b,String c){
		
		
	WebElement	txtA= driver.findElement(By.name("userName"));
	WebElement	txtB= driver.findElement(By.name("userName"));	
	//WebElement	txtC= driver.findElement(By.name("userName"));	
	//WebElement	btnSub= driver.findElement(By.name("userName"));
	
	txtA.sendKeys("Test");
	txtB.sendKeys("Test");
	btnLogin.click();
	
	
		
	}
	}
	
	
	

