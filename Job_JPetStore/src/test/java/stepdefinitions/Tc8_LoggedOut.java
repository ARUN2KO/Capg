package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.Utility;

public class Tc8_LoggedOut extends Utility{
	@Given("the user launcheddd the website")
	public void the_user_launcheddd_the_website() throws Exception {
		pageobjects.ShoppingCartPage.launchApp();
	}

	@When("the user has logged in with the valid credentials and the user has logged out {string} and {string}")
	public void the_user_has_logged_in_with_the_valid_credentials_and_the_user_has_logged_out_and(String FileName, String SheetName) throws Exception {
	    
		XSSFSheet testdata = getSheetData(FileName, SheetName);
		
		String userName = getValBasedonColNum(testdata,"valid",1);
		String password = getValBasedonColNum(testdata,"valid",2);
		
		//pageobjects.LoginPage.signin(userName, password);
		pageobjects.LoginPage.signin(userName, password);
		
		pageobjects.LoginPage.signout();
		
	}

	@Then("the user signed out")
	public void the_user_signed_out() {
		boolean result=pageobjects.LoginPage.checkLoggedOut();
	    assertEquals(result, true);
		
		driver.quit();
	    
	}


}
