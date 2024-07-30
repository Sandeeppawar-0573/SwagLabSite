package a.sl.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.sl.testbase.Testbase;

public class LogoutFunctionality  extends Testbase{
	@Test
	public void verifyLogoutFunctionality()
	{
	String expected_op="https://www.ssaucedemo.com/";
	product.clickonMenuBar();
	product.clickonlogout();
	String actual_op= driver.getCurrentUrl();
	System.out.println(actual_op);
	Assert.assertEquals(actual_op, expected_op);
	}
	
	
	 

}
