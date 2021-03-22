package test;

import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import locators.test11Locators;
import utilities.Action;
import utilities.util;
import variables.test11Variables;

public class reusableClass {
	WebDriver driver;
	WebDriverWait wait;
	Properties prop;
	util utils;
	Action elementActions;
	JavascriptExecutor js;
	
	public reusableClass() {
		utils = new util();
		prop = utils.init_prop();
		driver = utils.init_driver(prop);
		elementActions = new Action(driver);
		wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("WebDriverWaitTimeout")));
		js = (JavascriptExecutor) driver;
	}
	
	
public void test17(By locator, By cButton, By cButton2) {
		
		elementActions.MoveToElement(locator);
		elementActions.waitForElementPresent(cButton);
		elementActions.Click(cButton);
		elementActions.waitForElementPresent(cButton2);
		elementActions.Click(cButton2);
	}
	
	public void signin() {
		elementActions.Click(test11Locators.Signin);
		elementActions.SendKeys(test11Locators.email,test11Variables.email);
		elementActions.SendKeys(test11Locators.password,test11Variables.password);
		elementActions.Click(test11Locators.SubmitLogin);	
	}
	
	public String email() {
		String email=null;
		Random rand = new Random(); 
        int rand_int1 = rand.nextInt(1000); 
		email="demo.test"+rand_int1+"@gmail.com";
		return email;
	}
	
	public void winHandle()
	{
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
	}
	
	public void asserting(String erro_msg, String success_msg, String expected, String value) {
		Assert.assertEquals(erro_msg,expected,value);
		System.out.println(success_msg);
	}
}
