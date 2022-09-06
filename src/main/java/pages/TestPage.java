package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPage {
	
	WebDriver driver;

	
	public TestPage(WebDriver drive) {
		this.driver = drive;
		
		 }
	
	 @FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")
	 WebElement blueSky;
	 @FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")
	 WebElement whiteSky;
	 
	 
	 public void clickBlueSky () {
		
		 blueSky.click();
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
	 
	 public void clickWhiteSky () {
			
		 whiteSky.click();
		 
	 }
	 
	 
}
