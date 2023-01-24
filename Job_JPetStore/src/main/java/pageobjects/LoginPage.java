package pageobjects;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utility;



public class LoginPage extends Utility {
	
	@FindBy(linkText="Sign In")
	public static
	WebElement signinLink;
	
	@FindBy(xpath="//*[@id=\"MenuContent\"]/a[3]")
	public static
	WebElement signup;
	
	@FindBy(xpath ="//input[@name=\"username\"]")
	static
	WebElement userName;
	
	@FindBy(xpath ="//input[@name=\"password\"]")
	
	static
	WebElement password;
	
	@FindBy(xpath ="//button[text()=\"Login\"]")
	static
	WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"MenuContent\"]/a[4]")
	static
	WebElement signout;
	
	@FindBy(xpath="//*[@id=\"MenuContent\"]/a[3]")
	static
	WebElement myAccount;
	
	@FindBy(xpath="//*[@id=\"Signon\"]/form/div/div[2]")
	static
	WebElement errorMessage;


	public LoginPage(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		 driver = driverInstance;
	}
	
	public static void signin(String uName, String pwd) throws IOException, InterruptedException {
		//WebElement clickSignin = returnElement(signinLink, "clickable" );
		Thread.sleep(5000);
		signinLink.click();
		//wait.until(ExpectedConditions.visibilityOf(signinLink)).click();
		
		//WebElement clickUsername = returnElement(userName, "visible" );
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOf(userName)).clear();;	
		userName.clear();
		
		userName.sendKeys(uName);
		password.clear();
		password.sendKeys(pwd);
	    
		submit.click();
	}
	
	public static void signout() {
		signout.click();
	}
	
	public static boolean checkValidUser() {
		String actResult=myAccount.getText();
		System.out.println(actResult);
	
		return actResult.equals("My Account");
	}
	
	public static boolean checkInValidUser() {
		Boolean actResult=errorMessage.isDisplayed();
		System.out.println(actResult);
		return actResult;
	}
	
	public static boolean checkLoggedOut() {
		
		String actResult=signup.getText();
		System.out.println(actResult);
		return actResult.equals("Sign Up");
	}
	
}
