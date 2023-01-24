package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Utility;

public class Tc7_InValidLogin extends Utility {
	
	@Given("the user launchedd the website")
	public void the_user_launchedd_the_website() throws Exception {
		pageobjects.ShoppingCartPage.launchApp();
	}

	@When("the user has logged in with the invalid credentials {string} and {string}")
	public void the_user_has_logged_in_with_the_invalid_credentials_and(String FileName, String SheetName) throws Exception {
		XSSFSheet testdata = getSheetData(FileName, SheetName);
		
		String userName = getValBasedonColNum(testdata,"invalid",1);
		String password = getValBasedonColNum(testdata,"invalid",2);
		
		pageobjects.LoginPage.signin(userName, password);
	}

	@Then("the user get error message")
	public void the_user_get_error_message() {
		boolean result=pageobjects.LoginPage.checkInValidUser();
	    assertEquals(result, true);
		
		driver.quit();
	}


}
