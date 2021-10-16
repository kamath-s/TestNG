package rediff_tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import object_repository.Signin_email_page;
import rediff_object_repository.LandingPage;
import rediff_object_repository.PortfolioPage;
import rediff_object_repository.SigninPage;

public class signin_createpf {
	
	@Test
	public void signin() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","c://worksoft//chromedriver//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		
		LandingPage landingpage=new LandingPage(driver);
		
		PageFactory.initElements(driver, landingpage);
		
		SigninPage signinpage;
		signinpage=landingpage.SignInClick();
		// "kamath.s2020@rediffmail.com", "Welcome1$"
		signinpage.enteremail("");
		signinpage.enterpassword("");
		
		PortfolioPage pfpage;
		pfpage=signinpage.SignInClick();
		

		
	}

}
