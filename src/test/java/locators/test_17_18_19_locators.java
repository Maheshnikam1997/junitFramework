package locators;


import org.openqa.selenium.By;

public class test_17_18_19_locators {

	public static By Product1 =By.xpath("//ul[@id='homefeatured']//li//div//div//h5//a[contains(text(),'Faded Short Sleeve T-shirts')]");
	public static By Product2 =By.xpath("//ul[@id='homefeatured']//li//div//div//h5//a[contains(text(),'Blouse')]");
	public static By Product3 =By.xpath("//ul[@id='homefeatured']//li//div//div//h5//a[contains(text(),'Printed Chiffon Dress')]");
	public static By P_1_addTocart =By.xpath("//ul[@id='homefeatured']/li/div/div/div/a[@data-id-product='1']/span");
	public static By P_2_addTocart =By.xpath("//ul[@id='homefeatured']/li/div/div/div/a[@data-id-product='2']/span");
	public static By P_3_addTocart =By.xpath("//ul[@id='homefeatured']/li/div/div/div/a[@data-id-product='7']/span");
	public static By cartQnty =By.xpath("//div[@class='shopping_cart']/a/span[@class='ajax_cart_quantity unvisible']");
	public static By continueShopping =By.xpath("//div[@id='layer_cart']/div/div/div[@class='button-container']/span/span");
	
	//cart and cart box
	public static By cart =By.xpath("//div[@class='shopping_cart']//a");
	public static By cart_box =By.xpath("//div[@class='cart_block block exclusive']");
	
	//cart products
	public static By cart_p_1 =By.xpath("//div[@class='cart-info']//div//a[@title='Faded Short Sleeve T-shirts']");
	public static By cart_p_2 =By.xpath("//div[@class='cart-info']//div//a[@title='Blouse']");
	public static By cart_p_3 =By.xpath("//div[@class='cart-info']//div//a[@title='Printed Chiffon Dress']");
	
	//cart product price
	public static By cart_p1_price =By.xpath("//dt[@data-id='cart_block_product_1_1_0']/div/span");
	public static By cart_p2_price =By.xpath("//dt[@data-id='cart_block_product_2_7_0']/div/span");
	public static By cart_p3_price =By.xpath("//dt[@data-id='cart_block_product_7_34_0']/div/span");
	
	//cart total and shipping price
	public static By cart_shipping_price =By.xpath("//div[@class='cart-prices']/div/span[@class='price cart_block_shipping_cost ajax_cart_shipping_cost']");
	public static By cart_total_price =By.xpath("//div[@class='cart-prices']/div[@class='cart-prices-line last-line']/span[@class='price cart_block_total ajax_block_cart_total']");
	
	//product remove button
	public static By remove_btn =By.xpath("//dt[@data-id='cart_block_product_1_1_0']/span/a");
	
}
