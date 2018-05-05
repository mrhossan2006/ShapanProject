package modules;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageObjects.HomeDepotHomePage;


public class RegisterAction {

public static void Execute(WebDriver driver) throws Exception{
		
	    HomeDepotHomePage.myAccount.click();
	    
	    Thread.sleep(10000);
		
	    HomeDepotHomePage.register.click();
	    Thread.sleep(10000);
	    HomeDepotHomePage.emailField.sendKeys("refat@example.com");
	}
	
	
	
	
	
}
