package pageobjects;

import java.io.IOException;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.AutomationBase;
import utilities.Utility;

public class ShoppingCartPage extends Utility {
	@FindBy(xpath = "//a[@href=\"/catalog/categories/FISH\"]")
	static
	WebElement fish;
	
	@FindBy(linkText="FI-SW-01")
	static
	WebElement angelFish;
	
	@FindBy(xpath="//a[@href=\"/cart/addItemToCart?itemId=EST-1\"]")
	static
	WebElement largeAngelFishAdd;
	
	@FindBy(xpath="//a[@href=\"/cart/addItemToCart?itemId=EST-2\"]")
	static
	WebElement smallAngelFishAdd;
	
	@FindBy(xpath="//*[@id=\"Cart\"]/a")
	static
	WebElement checkoutButton;
	
	@FindBy(xpath ="//*[@id=\"CenterForm\"]/form/h3[1]")
	static
	WebElement successResult;
	
	@FindBy(xpath ="//img[@src=\"/images/cart.gif\"]")
	static
	WebElement cartLink;
	
	@FindBy(xpath ="//*[text()=\"Your cart is empty.\"]")
	static
	WebElement emptyText;
	
	@FindBy(xpath ="//a[text()=\"Remove\"]")
	static
	List<WebElement> removeButton;
	
	@FindBy(xpath ="//a[text()=\"Remove All\"]")
	static
	WebElement removeAllButton;
	
	@FindBy(xpath="//input[@name=\"EST-1\"]")
	static
	WebElement fishQuantityBox;
	
	@FindBy(xpath="//button[text()=\"Update Cart\"]")
	static
	WebElement updateButton;
	
	@FindBy(xpath="//tr[2]/td[6]")
	static
	WebElement fishPriceBox;
	
	@FindBy(xpath="//tr[2]/td[7]")
	static
	WebElement fishTotalPriceBox;
	
	
	
	
	public ShoppingCartPage(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
        driver = driverInstance;
	
}

public static void launchApp() throws Exception {
    AutomationBase.launchApp("https://jpetstore.aspectran.com/catalog/");
    explicitWait(2);
    logger.info("JPetStore is launched");
    
}
	
	public static void addItem(String product) {
		
		//WebElement clickFish = returnElement(fish, "clickable" );
		fish.click();
		angelFish.click();
		if(product.equals("largeFish")) {
			largeAngelFishAdd.click();
		}
		else if(product.equals("smallFish")) {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			smallAngelFishAdd.click();
		}
	}
	
	public static void clickProceed() {
		//WebElement clickCheckoutButton = returnElement(checkoutButton, "clickable" );
		checkoutButton.click();
		
	}
	
	public static void clickCart() {
		cartLink.click();
	}
	
	
	
	public static boolean checkSuccessCheckOut() {
		String actResult=successResult.getText();
		System.out.println(actResult);
		return actResult.equals("Payment Details");
	}
	
	public static boolean checkEmptyResult() {
		String actResult=emptyText.getText();
		return actResult.equals("Your cart is empty.");
	}
	
	public static boolean checkProceed() {
		int result=driver.findElements(By.linkText("Proceed to Checkout")).size();
		return (result==0);
	}
	
	public static int checkItems() {
		return removeButton.size();
	}
	
	public static void clickRemove() throws InterruptedException {
		//WebElement clickRemoveButton = returnElement(removeButton.get(0), "clickable" );
		//wait.until(ExpectedConditions.elementToBeClickable(removeButton.get(0))).click();
		Thread.sleep(5000);
		removeButton.get(0).click();
	}
	
	public static void clickRemoveAll() throws InterruptedException {
		//WebElement clickRemoveAllButton = returnElement(removeAllButton, "clickable" );
		//wait.until(ExpectedConditions.elementToBeClickable(removeAllButton)).click();
		Thread.sleep(5000);
		removeAllButton.click();
	}
	
	public static void increaseQuantity(String quantity) {
		fishQuantityBox.clear();
		fishQuantityBox.sendKeys(quantity);
	}
	
	public static void clickUpdate() {
		updateButton.click();
	}
	
	public static boolean checkUpdate() {
		float fishPrice=Float.parseFloat(fishPriceBox.getText().substring(1));
		float fishTotalPrice=Float.parseFloat(fishTotalPriceBox.getText().substring(1));
		int quantity=Integer.parseInt(fishQuantityBox.getAttribute("value"));
		if(fishPrice*quantity==fishTotalPrice) {
			return true;
		}
		else {
			return false;
		}
	}
}
