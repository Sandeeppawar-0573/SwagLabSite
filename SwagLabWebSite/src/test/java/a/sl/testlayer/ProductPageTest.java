package a.sl.testlayer;
  
import org.testng.annotations.Test;

import ai.sl.testbase.Testbase;
import junit.framework.Assert;

public class ProductPageTest extends Testbase {
	@Test 
	public void verifyAddtoCartFunctionality()
	{
		String ecpected_op="Remove";
		product.clickonAddtoCart();
	    String actual_op=product.getTextonAddtoCartButton();
		System.out.println(actual_op);
		Assert.assertEquals(actual_op, ecpected_op);
	}
	
	@Test
	public void VerifythatUsercansortProductNamefromZtoA()
	{
		String expected_op="Name (Z to A)";
		product.selectProductNameZtoA();
		String actual_op=product.getTextonFilterBox();	
		System.out.println(actual_op);
		Assert.assertEquals(actual_op, expected_op);
	}

	@Test
	public void VerifythatusercansortProductPricefromHightoLow()
	{
		String expected_op="Price (high to low)";
		product.selectProductPriceHightoLow();
		String actual_op=product.getTextonFilterBox();	
		System.out.println(actual_op);
		Assert.assertEquals(actual_op, expected_op);
	}
	
	@Test
	public void verifylogoofBackPackProduct() {
		boolean result=product.checklogoofBackpack();
		System.out.println(result);
	//	Assert.assertTrue(result);
		Assert.assertFalse(result);
		
	}
	

}
