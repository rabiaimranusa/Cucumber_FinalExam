package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestBase;
import pages.TestPage;

public class ExamStepDefination extends TestBase {
	
	
	TestPage testpage;
	
	@Before
	public void methodName() {
		initDriver();
		
		testpage =	PageFactory.initElements(driver,TestPage.class );
		
	}
	
	@Given("^in the provided url page$")
	public void in_the_provided_url_page()  {

	}
	
	@Given("^set skyblue backgroung button exists$")
	public void set_skyblue_backgroung_button_exists()  {
		
	  
	}

	@When("^I click on the button$")
	public void i_click_on_the_button()  {
	   testpage.clickBlueSky();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
	  
	}

	@Given("^be in the provided url page$")
	public void be_in_the_provided_url_page()  {
	   
	}

	@Given("^set skywhite background button exists$")
	public void set_skywhite_background_button_exists() {
		testpage.clickBlueSky();
	}

	@When("^I  click on the button$")
	public void i_click_on_the_button1() {
	   testpage.clickWhiteSky();
		
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
	   
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}

}
