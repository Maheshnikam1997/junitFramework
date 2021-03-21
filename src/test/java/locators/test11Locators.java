package locators;

import org.openqa.selenium.By;

public class test11Locators {

	public static By Signin =By.xpath("//a[@class='login']");
	public static By email = By.xpath("//input[@id='email']");
	public static By password = By.xpath("//input[@id='passwd']");
	public static By SubmitLogin = By.xpath("//button[@id='SubmitLogin']");
	public static By t_shirt = By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='T-shirts']");
	public static By product = By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	public static By moreBtn = By.xpath("//a[@class='button lnk_view btn btn-default']//span");
	public static By sendToFriend = By.xpath("//a[@id='send_friend_button']");
	public static By input1 = By.xpath("//input[@id='friend_name']");
	public static By input2 = By.xpath("//input[@id='friend_email']");
	public static By sendBtn = By.xpath("//button[@id='sendEmail']");
	public static By msg = By.xpath("//div[@class='fancybox-inner']//p[text()='Your e-mail has been sent successfully']");
	public static By okBtn = By.xpath("//input[@class='button']");
}
