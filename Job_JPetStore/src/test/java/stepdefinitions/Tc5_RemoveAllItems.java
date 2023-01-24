package stepdefinitions;

import static org.testng.Assert.assertEquals;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.Utility;

public class Tc5_RemoveAllItems extends Utility{

	@Given("the user has logged in and the user has added many products in the cart {string} and {string}")
	public void the_user_has_logged_in_and_the_user_has_added_many_products_in_the_cart_and(String FileName, String SheetName) throws Exception {
		
		pageobjects.ShoppingCartPage.launchApp();
		
		XSSFSheet testdata = getSheetData(FileName, SheetName);
		
		String userName = getValBasedonColNum(testdata,"valid",1);
		String password = getValBasedonColNum(testdata,"valid",2);
		
		pageobjects.LoginPage.signin(userName, password);
	    
		
	    pageobjects.ShoppingCartPage.addItem("largeFish");
	    pageobjects.ShoppingCartPage.addItem("smallFish");
	}

	@When("the user clicks remove all")
	public void the_user_clicks_remove_all() throws IOException, InterruptedException {
		
		pageobjects.ShoppingCartPage.clickRemoveAll();
	   
	    
	}

	@Then("the all products are removed")
	public void the_all_products_are_removed() {
		boolean result=pageobjects.ShoppingCartPage.checkEmptyResult();
	    assertEquals(result, true);
		
		driver.quit();
	}

}
