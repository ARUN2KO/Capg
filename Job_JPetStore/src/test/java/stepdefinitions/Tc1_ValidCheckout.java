package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.AutomationBase;
import utilities.Utility;



public class Tc1_ValidCheckout extends Utility{

	

	@Given("the user has logged in and the user has added a product in the Shopping cart {string} and {string}")
	public void the_user_has_logged_in_and_the_user_has_added_a_product_in_the_shopping_cart_and(String FileName, String SheetName) throws Exception {
		//      _and(String SheetName, Integer row)
		
		//pageobjects.ShoppingCartPage.launchApp();
	                	
		pageobjects.ShoppingCartPage.launchApp();
		
		XSSFSheet testdata = getSheetData(FileName, SheetName);
		
		String userName = getValBasedonColNum(testdata,"valid",1);
		String password = getValBasedonColNum(testdata,"valid",2);
		
		pageobjects.LoginPage.signin(userName, password);
		
//		System.out.println("/n/n/n");
//		System.out.println(userName); 
//		System.out.println(password);
//		System.out.println("/n/n/n");
	    
	    
	    
	    pageobjects.ShoppingCartPage.addItem("largeFish");
	    
	   
	    
	}

	@When("the user clicks proceed to checkout")
	public void the_user_clicks_proceed_to_checkout() throws Exception {
		
		
		pageobjects.ShoppingCartPage.clickProceed();
		
	    
	    
	}
	
	@Then("the user is redirected to the payment page")
	public void the_user_is_redirected_to_the_payment_page(){
		
	    boolean result = pageobjects.ShoppingCartPage.checkSuccessCheckOut();
	    assertEquals(result, true);
	   
	    driver.quit();
	}
	
}
