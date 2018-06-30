package learnmaven.Logintest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import learnmaven.setup.Setup;
import maven.pageobject.HomepageElements;

public class NewtoursTestcases extends Setup{
	
	//To verify the labels on the Home page
	@Test
	public void testLabelPresent() throws InterruptedException {
		
		HomepageElements elementsPresent=PageFactory.initElements(driver, HomepageElements.class);
		String Linkhome=elementsPresent.VerifyElements();
		String Exptlabel="Home";
		Assert.assertEquals(Linkhome, Exptlabel, "Present");
		
		
	  }
	
 
}


