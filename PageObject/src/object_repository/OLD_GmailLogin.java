package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OLD_GmailLogin {
	

	WebDriver localdriver;

	public OLD_GmailLogin(WebDriver driver)
	{
		this.localdriver = driver;
	}
	
	
	
	By email=By.xpath("//input[@id='identifierId']");
	//By password=By.name("passwd");
	By nextbtn=By.xpath("//span[contains(text(),'Next')]");
	
	
	public WebElement emailid()
	{
		return localdriver.findElement(email);
	}
	
	public WebElement next()
	{
		return localdriver.findElement(nextbtn);
	}



}
