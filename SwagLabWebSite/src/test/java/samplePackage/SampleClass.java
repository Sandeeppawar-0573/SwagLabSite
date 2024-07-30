package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SampleClass {
 public WebDriver driver;
 public JavascriptExecutor j;
		@BeforeMethod
	public void startBrowser()
	{
		driver = new ChromeDriver();
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
		
		@AfterMethod
		public void closebrowser()
		{
			driver.quit();
		}
		
		
		@Test 
		public void verifyAddtoCartScanario()
		{
			String expected_op=" Success: You have added MacBook to your shopping cart!";
		    j = ((JavascriptExecutor)driver);
			j.executeScript("scroll(0,500)");
			driver.findElement(By.xpath("//a[text()=\"MacBook\"]")).click();
			j.executeScript("scroll(0,300)");
			WebElement txtbox_quantity = driver.findElement(By.xpath("//input[@name=\"quantity\"]"));
			txtbox_quantity.click();
			txtbox_quantity.clear();
			txtbox_quantity.sendKeys("2");
			driver.findElement(By.xpath("//button[@id=\"button-cart\"]")).click();
		    String actual_op=driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();
			System.out.println(actual_op);
			Assert.assertEquals(actual_op, expected_op);
		}
		
		@Test 
		public void verifyShoppingCartURL()
		{ 
			String expected_op="https://tutorialsninja.com/demo/index.php?route=checkout/cart";
			driver.findElement(By.xpath("(//i[@class=\"fa fa-shopping-cart\"])[1]")).click();
			String actual_op = driver.getCurrentUrl();
			Assert.assertEquals(actual_op, expected_op);
		}
		
		
		@Test 
		public void verifyTotalPrice()
		{
			String expected_op="";
			j = ((JavascriptExecutor)driver);
			j.executeScript("scroll(0,400)");
			driver.findElement(By.xpath("//button[@onclick=\"cart.add('43');\"]")).click();
			j.executeScript("scroll(0,400)");
			driver.findElement(By.xpath("//button[@ onclick=\"cart.add('40');\"]")).click();
			String actual_op=driver.findElement(By.xpath("(//button[@ data-toggle=\"dropdown\"])[2]")).getText();
			System.out.println(actual_op);
			Assert.assertEquals(actual_op, expected_op);
			
			
		}

}
