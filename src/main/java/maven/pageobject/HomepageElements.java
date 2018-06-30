package maven.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageElements {
	
	WebDriver driver;
	
	@FindBy(name="userName")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="login")
	WebElement btnSignIn;
	
	@FindBy(xpath="//a[contains(@href,'mercurywelcome.php')]")
	WebElement LnkHome;
	
	@FindBy(xpath="//a[contains(text(),'Flights')]")
	WebElement LnkFlight;
	
	@FindBy(xpath="//a[contains(text(),'Hotels')]")
	WebElement LnkHotel;
	
	@FindBy(xpath="//a[contains(text(),'Car Rentals')]")
	WebElement LnkCarRental;
	
	@FindBy(xpath="//a[contains(text(),'Cruises')]")
	WebElement LnkCruises;
	
	@FindBy(xpath="//a[contains(text(),'Destinations')]")
	WebElement LnkDestinations;
	
	@FindBy(xpath="//a[contains(text(),'Vacations')]")
	WebElement LnkVacations;
	
	
	public  HomepageElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public String VerifyElements(){
		
		String LinkHome=LnkHome.getText();
		return LinkHome;
		
		}
	
	
	}
	
	
	

