package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Utility;

public class Tc6_ValidLogin extends Utility{
	
	
	@Given("the user launched the website")
	public void the_user_launched_the_website() throws Exception {
	   
		pageobjects.ShoppingCartPage.launchApp();
		
	}

	@When("the user has logged in with the valid credentials {string} and {string}")
	public void the_user_has_logged_in_with_the_valid_credentials_and(String FileName, String SheetName) throws Exception {
		
		
		
		XSSFSheet testdata = getSheetData(FileName, SheetName);
		
		String userName = getValBasedonColNum(testdata,"valid",1);
		String password = getValBasedonColNum(testdata,"valid",2);
		
		pageobjects.LoginPage.signin(userName, password);
	}

	@Then("the user got signed in")
	public void the_user_got_signed_in() {
		boolean result=pageobjects.LoginPage.checkValidUser();
	    assertEquals(result, true);
		
		driver.quit();
	    
	}



}
