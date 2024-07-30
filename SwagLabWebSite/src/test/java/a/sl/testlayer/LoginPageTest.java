package a.sl.testlayer;

import org.testng.annotations.Test
;

import ai.sl.pagelayer.LoginPage;
import ai.sl.testbase.Testbase;
import junit.framework.Assert;

public class LoginPageTest  extends Testbase{
	
	@Test
	public void verifyLoginTestWithValidCredeintial() 
	{
		String expected_op="https://www.saucedemo.com/inventory.html";
		String actual_op=driver.getCurrentUrl();
		System.out.println( actual_op);
		Assert.assertEquals(actual_op, expected_op);
	
	}
	
	  

}
