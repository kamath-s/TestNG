package testcases;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import object_repository.OLD_GmailLogin;

public class OLD_LoginTestcase {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","c://worksoft//chromedriver//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		
		OLD_GmailLogin gl=new OLD_GmailLogin(driver);
		
		gl.emailid().sendKeys("email-id");
		gl.next().click();
		
		System.out.println("End of code");
		
	}

}
