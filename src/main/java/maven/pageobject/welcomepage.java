package maven.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class welcomepage {
	WebDriver driver=new ChromeDriver();
	WebElement txtUsername;
	WebElement txtPassword;
	WebElement btnLogin;
	public  welcomepage(WebDriver driver) {
		this.driver=driver;
	}
	public void login() {
		
		txtUsername=driver.findElement(By.name("userName"));
		
		
	}
	}

