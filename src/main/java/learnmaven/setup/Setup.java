package learnmaven.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Setup {
public static WebDriver driver;
	
	@BeforeSuite
	public void LaunchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susan\\chromedriver_win32 (2)\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		}
	
	@BeforeTest
	public void launchApplication(){
		
		
		driver.get("http://newtours.demoaut.com/");
		
	}
	
	@AfterTest
	public void CloseApplication(){
		
		driver.quit();
		
	}
	
	@AfterSuite
	public void Closebrowser(){
	   driver.close();
		
	}
}
