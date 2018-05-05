package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeDepotHomePage extends BasePage {

	public HomeDepotHomePage(WebDriver driver) {
		super(driver);
	
	}

	


	@FindBy(how=How.XPATH, using="//*[@id='headerMyAccountTitle']/div")
	public static WebElement myAccount;
	
	
	@FindBy(how=How.LINK_TEXT, using="Register")
	public static WebElement register;
	
	
	@FindBy(how=How.ID, using="email_id")
	public static WebElement emailField;
	
	
	

	
	
}
