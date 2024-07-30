 package ai.sl.testbase;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ai.sl.pagelayer.LoginPage;
import ai.sl.pagelayer.OverviewPage;
import ai.sl.pagelayer.ProductPage;
import ai.sl.pagelayer.YourinformationtPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public static  WebDriver driver;
	public LoginPage login;
	public ProductPage product;
	public YourinformationtPage yourinfo;
	public OverviewPage overview;
	
	@BeforeMethod
	public void start() {
		String BrowserName="chrome";
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		
		else if(BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new 	FirefoxDriver();
		}
		
		else
		{
			System.out.println("Provide valid browser");
		}
		
		
		//open  the browser 
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Object repo
		 login= new LoginPage();
		 product=new ProductPage();
		 yourinfo= new YourinformationtPage();
		 overview=new OverviewPage();
		 
		 
		 // login steps
		 login.enterUserID("standard_user");
		 login.enterPassword("secret_sauce");
		 login.clickonLogin();
		
	}
	
	  
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
