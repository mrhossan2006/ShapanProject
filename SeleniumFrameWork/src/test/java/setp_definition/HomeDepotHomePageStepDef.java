package setp_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.RegisterAction;
import pageObjects.HomeDepotHomePage;
import pageObjects.Hooks;

public class HomeDepotHomePageStepDef {

	 public WebDriver driver;
	    
	    public HomeDepotHomePageStepDef()
	    {
	    	driver = Hooks.driver;
	    }
	
	
	  
	
	@Given("^User navigate to Home Deopt Landing Page$")
	public void user_navigate_to_Home_Deopt_Landing_Page() throws Throwable {
		 
		driver.get("https://www.homedepot.com/");
	}

	@When("^User click on My account Link$")
	public void user_click_on_My_account_Link() throws Throwable {
	  
		 PageFactory.initElements(driver, HomeDepotHomePage.class);
		 RegisterAction.Execute(driver);
		
		
		
		
		
	}

	@Then("^User Click on Register Button$")
	public void user_Click_on_Register_Button() throws Throwable {
	    
	}

	@And("^User fill Up all the required Infomation$")
	public void user_fill_Up_all_the_required_Infomation() throws Throwable {
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
