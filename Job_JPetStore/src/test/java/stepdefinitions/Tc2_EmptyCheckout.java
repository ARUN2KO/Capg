package stepdefinitions;

import static org.testng.Assert.assertEquals;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.Utility;


public class Tc2_EmptyCheckout extends Utility{

	@Given("the user has logged in {string} and {string}")
	public void the_user_has_logged_in_and(String FileName, String SheetName) throws Exception {
		
pageobjects.ShoppingCartPage.launchApp();
		
		XSSFSheet testdata = getSheetData(FileName, SheetName);
		
		String userName = getValBasedonColNum(testdata,"valid",1);
		String password = getValBasedonColNum(testdata,"valid",2);
		
		pageobjects.LoginPage.signin(userName, password);  
	}

	@When("the user clicks the shopping cart")
	public void the_user_clicks_the_shopping_cart() throws IOException {
		pageobjects.ShoppingCartPage.clickCart();
	   
	    
	}

	@Then("the user sees a empty cart message and the proceed to checkout option is not visible")
	public void the_user_sees_a_empty_cart_message_and_the_proceed_to_checkout_option_is_not_visible() {
	    boolean emptyResult=pageobjects.ShoppingCartPage.checkEmptyResult();
	    boolean proceedCheck=pageobjects.ShoppingCartPage.checkProceed();
	    assertEquals(emptyResult, true);
	    assertEquals(proceedCheck, true);
	    
		driver.quit();
	}
}
