package utilities;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.test_17_18_19_locators;





public class Action {

	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	Properties prop;
	util utils;
	public Action(WebDriver driver) {
		this.driver = driver;
		utils = new util();
		prop = utils.init_prop();
		wait = new WebDriverWait(this.driver, Integer.parseInt(prop.getProperty("WebDriverWaitTimeout")));
		action = new Actions(this.driver);

	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		element = driver.findElement(locator);
		return element;
	}
	
	public void Click(By locator) 
	{
		getElement(locator).click();
	}
	
	public void SendKeys(By locator, String value) 
	{
		getElement(locator).sendKeys(value);
	}
	
	public String GetText(By locator)
	{
		String text=getElement(locator).getText();
		return text;
	}
	
	public void MoveToElement(By locator)
	{
		action.moveToElement(getElement(locator)).build().perform();
	}
	
	public void waitForElementPresent(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	public String getAttribute(By locator,String Src)
	{
		String attr=getElement(locator).getAttribute(Src);
		return attr;
	}
	
	public double convertTointeger(By locator)
	{
		double price=0;
		price=Float.parseFloat(GetText(locator).substring(1));
		return price;
	}
}
