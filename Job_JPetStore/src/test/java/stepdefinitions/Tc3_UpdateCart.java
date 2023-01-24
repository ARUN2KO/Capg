package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.Utility;


public class Tc3_UpdateCart extends Utility{

	@Given("the user has logged in and the user has added a product in cart {string} and {string}")
	public void the_user_has_logged_in_and_the_user_has_added_a_product_in_cart_and(String FileName, String SheetName) throws Exception {
		
		pageobjects.ShoppingCartPage.launchApp();
		
		XSSFSheet testdata = getSheetData(FileName, SheetName);
		
		String userName = getValBasedonColNum(testdata,"valid",1);
		String password = getValBasedonColNum(testdata,"valid",2);
		
		pageobjects.LoginPage.signin(userName, password);
	    
	    pageobjects.ShoppingCartPage.addItem("largeFish");
	}
	
	@When("the user increase the product and click update")
	public void the_user_increase_the_product_and_click_update() throws IOException {
		pageobjects.ShoppingCartPage.increaseQuantity("5");
	    
		pageobjects.ShoppingCartPage.clickUpdate();
	    
	  
	    
	}
	
	@Then("the quantity of the product is increased")
	public void the_quantity_of_the_product_is_increased() {
		boolean result=pageobjects.ShoppingCartPage.checkUpdate();
		assertEquals(result, true);
		 driver.quit();
	}



}
