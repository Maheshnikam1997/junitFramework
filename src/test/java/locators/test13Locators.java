package locators;

import org.openqa.selenium.By;

public class test13Locators {
	public static By Fb =By.xpath("//ul//li[@class='facebook']");
	public static By FB_page_name =By.xpath("//div[@class='bi6gxh9e aov4n071']//h2//span");
	public static By Tw =By.xpath("//ul//li[@class='twitter']");
	public static By Tw_page_name =By.xpath("//div[@dir='auto' and @class='css-901oao r-18jsvk2 r-1qd0xha r-adyw6z r-1vr29t4 r-135wba7 r-bcqeeo r-qvutc0']//span//span");
	public static By Yt =By.xpath("//ul//li[@class='youtube']");
	public static By Yt_page_name =By.xpath("//yt-formatted-string[@id='text' and text()='Selenium Framework']");
	public static By Nl =By.xpath("//input[@id='newsletter-input']");
	public static By Nl_page_name =By.xpath("//yt-formatted-string[@id='text' and text()='Selenium Framework']");
	public static By Nl_msg =By.xpath("//p[@class='alert alert-success']");
	public static By Nl_msg_btn =By.xpath("//button[@name='submitNewsletter']");
}
