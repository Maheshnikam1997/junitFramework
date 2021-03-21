package test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import locators.test11Locators;
import locators.test12Locators;
import locators.test13Locators;
import locators.test_17_18_19_locators;
import variables.test11Variables;
import variables.test12Variables;
import variables.test_17_18_19_variables;



public class test {
	
	reusableClass rs= new reusableClass();
	
	
	@Test
	public void test1() throws InterruptedException
	{
		rs.signin();
		rs.elementActions.waitForElementPresent(test11Locators.t_shirt);
		rs.elementActions.Click(test11Locators.t_shirt);
		rs.elementActions.waitForElementPresent(test11Locators.product);
		rs.elementActions.MoveToElement(test11Locators.product);
		rs.elementActions.Click(test11Locators.moreBtn);
		rs.elementActions.waitForElementPresent(test11Locators.sendToFriend);
		rs.elementActions.Click(test11Locators.sendToFriend);
		rs.elementActions.waitForElementPresent(test11Locators.input1);
		rs.elementActions.SendKeys(test11Locators.input1,test11Variables.input1);
		rs.elementActions.SendKeys(test11Locators.input2,test11Variables.input2);
		rs.elementActions.Click(test11Locators.sendBtn);
		rs.elementActions.waitForElementPresent(test11Locators.msg);
		Assert.assertEquals("msg test not passed",test11Variables.msg,rs.elementActions.GetText(test11Locators.msg));
		System.out.println("Msg validaiton test Passed i.e:"+test11Variables.msg);
		rs.elementActions.Click(test11Locators.okBtn);
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		rs.signin();
		rs.elementActions.waitForElementPresent(test11Locators.t_shirt);
		rs.elementActions.Click(test11Locators.t_shirt);
		rs.elementActions.MoveToElement(test11Locators.product);
		rs.elementActions.waitForElementPresent(test12Locators.color);
		rs.elementActions.Click(test12Locators.color);
		rs.elementActions.waitForElementPresent(test12Locators.imgSrc);
		Assert.assertEquals("Image is Not Changed",test12Variables.ExpectedImageSrc,rs.elementActions.getAttribute(test12Locators.imgSrc,"src"));
		System.out.println("Images is Changed to blue.");
		System.out.println("Changed Image src:"+test12Variables.ExpectedImageSrc);
		rs.js.executeScript("window.scrollBy(0,300)");
		
		
//		//alternate method to check image is changed or not
//		elementActions.waitForElementPresent(test12Locators.color2);
//		Assert.assertEquals("Image is Not Changed","Blue",elementActions.getAttribute(test12Locators.color2,"title"));
//		System.out.println("Images is Changed to blue.");
		
		
	}
	
	@Test
	public void test3() throws InterruptedException {
		rs.elementActions.waitForElementPresent(test13Locators.Fb);
		rs.elementActions.Click(test13Locators.Fb);
		rs.winHandle();
		Assert.assertEquals("Fb Page name not validated","Selenium Framework",rs.elementActions.GetText(test13Locators.FB_page_name));
		System.out.println("FB page name validated:Selenium Framework");
		
	}
	
	@Test
	public void test4() throws InterruptedException{
		rs.elementActions.waitForElementPresent(test13Locators.Tw);
		rs.elementActions.Click(test13Locators.Tw);
		rs.winHandle();
		Assert.assertEquals("Twitter Page name not validated","Selenium Framework",rs.elementActions.GetText(test13Locators.Tw_page_name));
		System.out.println("Twitter page name validated:Selenium Framework");
		
	}
	
	@Test
	public void test5() throws InterruptedException{
		rs.elementActions.waitForElementPresent(test13Locators.Yt);
		rs.elementActions.Click(test13Locators.Yt);
		rs.winHandle();
		Assert.assertEquals("Youtube Page name not validated","Selenium Framework",rs.elementActions.GetText(test13Locators.Yt_page_name));
		System.out.println("Youtube page name validated:Selenium Framework");
		
	}
	
	@Test
	public void test6() throws InterruptedException{
		rs.elementActions.waitForElementPresent(test13Locators.Nl);
		rs.elementActions.SendKeys(test13Locators.Nl,rs.email());
		rs.elementActions.waitForElementPresent(test13Locators.Nl_msg_btn);
		rs.elementActions.Click(test13Locators.Nl_msg_btn);
		rs.elementActions.waitForElementPresent(test13Locators.Nl_msg);
		Assert.assertEquals("Newsletter Msg not validated","Newsletter : You have successfully subscribed to this newsletter.",rs.elementActions.GetText(test13Locators.Nl_msg));
		System.out.println("Newsletter Msg validated");
		
	}
	
	@Test
	public void _17_test() throws InterruptedException{
		try {
			rs.test17(test_17_18_19_locators.Product1,test_17_18_19_locators.P_1_addTocart,test_17_18_19_locators.continueShopping);
			rs.test17(test_17_18_19_locators.Product2,test_17_18_19_locators.P_2_addTocart,test_17_18_19_locators.continueShopping);
			rs.test17(test_17_18_19_locators.Product3,test_17_18_19_locators.P_3_addTocart,test_17_18_19_locators.continueShopping);
			
			Assert.assertEquals("Cart qnty is not 3","3",rs.elementActions.GetText(test_17_18_19_locators.cartQnty));
			System.out.println("Cart qnty is 3");
			
//			elementActions.waitForElementPresent(test_17_18_19_locators.cart);
//			elementActions.MoveToElement(test_17_18_19_locators.cart);
//			Thread.sleep(5000);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void _18_test() throws InterruptedException{
		rs.test17(test_17_18_19_locators.Product1,test_17_18_19_locators.P_1_addTocart,test_17_18_19_locators.continueShopping);
		rs.test17(test_17_18_19_locators.Product2,test_17_18_19_locators.P_2_addTocart,test_17_18_19_locators.continueShopping);
		rs.test17(test_17_18_19_locators.Product3,test_17_18_19_locators.P_3_addTocart,test_17_18_19_locators.continueShopping);
		
		rs.elementActions.MoveToElement(test_17_18_19_locators.cart);
		rs.elementActions.waitForElementPresent(test_17_18_19_locators.cart_box);
		Assert.assertEquals("Product one is not verifiede error:404",test_17_18_19_variables.product1,rs.elementActions.getAttribute(test_17_18_19_locators.cart_p_1,"title"));
		System.out.println("Product one is verified successfully");
		
		Assert.assertEquals("Product two is not verifiede error:404",test_17_18_19_variables.product2,rs.elementActions.getAttribute(test_17_18_19_locators.cart_p_2,"title"));
		System.out.println("Product two is verified successfully");
		
		Assert.assertEquals("Product three is not verifiede error:404",test_17_18_19_variables.product3,rs.elementActions.getAttribute(test_17_18_19_locators.cart_p_3,"title"));
		System.out.println("Product three is verified successfully");
		
	}
	
	@Test
	public void _19_test() throws InterruptedException{
		rs.test17(test_17_18_19_locators.Product1,test_17_18_19_locators.P_1_addTocart,test_17_18_19_locators.continueShopping);
		rs.test17(test_17_18_19_locators.Product2,test_17_18_19_locators.P_2_addTocart,test_17_18_19_locators.continueShopping);
		rs.test17(test_17_18_19_locators.Product3,test_17_18_19_locators.P_3_addTocart,test_17_18_19_locators.continueShopping);
		
		rs.elementActions.MoveToElement(test_17_18_19_locators.cart);
		rs.elementActions.waitForElementPresent(test_17_18_19_locators.cart_box);
		//System.out.println(elementActions.GetText(test_17_18_19_locators.cart_p1_price));
		double P_1_price=rs.elementActions.convertTointeger(test_17_18_19_locators.cart_p1_price);
		double P_2_price=rs.elementActions.convertTointeger(test_17_18_19_locators.cart_p2_price);
		double P_3_price=rs.elementActions.convertTointeger(test_17_18_19_locators.cart_p3_price);
		
		double total=Math.round((P_1_price+P_2_price+P_3_price) * 100.0) / 100.0;
				
		
		double shipping=rs.elementActions.convertTointeger(test_17_18_19_locators.cart_shipping_price);
		double cart_total=rs.elementActions.convertTointeger(test_17_18_19_locators.cart_total_price);
		
		cart_total=Math.round((cart_total-shipping) * 100.0) / 100.0;
		Assert.assertEquals("cart total after removing shipping charge is not same total of all individual product",String.valueOf(total),String.valueOf(cart_total));
		System.out.println("cart total after removing shipping charge is same total of all individual product i.e "+cart_total);
		
	}
	
	@Test
	public void _20_test() throws InterruptedException{
		rs.test17(test_17_18_19_locators.Product1,test_17_18_19_locators.P_1_addTocart,test_17_18_19_locators.continueShopping);
		rs.test17(test_17_18_19_locators.Product2,test_17_18_19_locators.P_2_addTocart,test_17_18_19_locators.continueShopping);
		rs.test17(test_17_18_19_locators.Product3,test_17_18_19_locators.P_3_addTocart,test_17_18_19_locators.continueShopping);
		rs.elementActions.MoveToElement(test_17_18_19_locators.cart);
		rs.elementActions.waitForElementPresent(test_17_18_19_locators.cart_box);
		rs.elementActions.waitForElementPresent(test_17_18_19_locators.remove_btn);
		rs.elementActions.Click(test_17_18_19_locators.remove_btn);
		
		Thread.sleep(5000);
		Assert.assertEquals("Cart qnty is not 2","2",rs.elementActions.GetText(test_17_18_19_locators.cartQnty));
		System.out.println("Cart qnty is 2");
		
	}
	

	@After
	public void teardown() throws InterruptedException
	{
		rs.driver.quit();
	}
}

