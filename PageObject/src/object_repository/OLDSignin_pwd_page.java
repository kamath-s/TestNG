package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OLDSignin_pwd_page {
	
	WebDriver localdriver;


	public OLDSignin_pwd_page(WebDriver driver)
	{
		this.localdriver = driver;
		
	}

	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	public WebElement nextbtn;
	
	@FindBy(linkText="Terms")
	public WebElement linkTerms;
	
	public void enterpwd( String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickTerms() {
		linkTerms.click();
	}
	
}
