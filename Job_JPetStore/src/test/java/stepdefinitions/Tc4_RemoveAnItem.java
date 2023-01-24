package stepdefinitions;

import static org.testng.Assert.assertEquals;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.Utility;


public class Tc4_RemoveAnItem extends Utility{
	
	
	int beforeRemove,afterRemove;	
	
	@Given("the user has logged in and the user has added a product in the cart {string} and {string}")
	public void the_user_has_logged_in_and_the_user_has_added_a_product_in_the_cart_and(String FileName, String SheetName) throws Exception {
		pageobjects.ShoppingCartPage.launchApp();
		
		XSSFSheet testdata = getSheetData(FileName, SheetName);
		
		String userName = getValBasedonColNum(testdata,"valid",1);
		String password = getValBasedonColNum(testdata,"valid",2);
		
		pageobjects.LoginPage.signin(userName, password);
		
		
	    pageobjects.ShoppingCartPage.addItem("largeFish");
	}

	@When("the user clicks remove")
	public void the_user_clicks_remove() throws IOException, InterruptedException {
	    beforeRemove= pageobjects.ShoppingCartPage.checkItems();
	    		pageobjects.ShoppingCartPage.clickRemove();
	    
	}
	
	@Then("the specific product is removed")
	public void the_specific_product_is_removed() {
	   afterRemove=pageobjects.ShoppingCartPage.checkItems();
	   boolean result=((beforeRemove-afterRemove)==1);
	   assertEquals(result, true);
	   
	   driver.quit();
	}



}
