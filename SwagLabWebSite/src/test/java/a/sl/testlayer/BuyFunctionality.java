package a.sl.testlayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ai.sl.testbase.Testbase;
import junit.framework.Assert;

public class BuyFunctionality extends Testbase {

	@Test
	public void verifyUserCanBuyProductWithValidCredential() {
		String expected_op = "Thank you for your order!";
		JavascriptExecutor j = (JavascriptExecutor) driver;

		product.clickonBtnAddtocartoBackPack();
		j.executeScript("scroll(0,400)");
		product.clickonBtnAddtocartoTshirt();
		j.executeScript("scroll(-400,0)");
		product.clickonLogoofBucket();
		yourinfo.clickonCheckoutButton();
		yourinfo.enterFirstName("sandy");
		yourinfo.enterLastName("pawar");
		yourinfo.enterPostCode("565566");
		yourinfo.clickonContinoueButton();
		overview.clickonFinishButton();
		String actual_op = overview.getTextofThankYou();
		System.out.println(actual_op);
		Assert.assertEquals(actual_op, expected_op);
	}

	@Test
	public void verifyUserCannotBuyProductWithEmptyCredential() {
		String expected_op="Error: Postal Code is required";
		JavascriptExecutor j = (JavascriptExecutor) driver;

		product.clickonBtnAddtocartoBackPack();
		j.executeScript("scroll(0,400)");
		product.clickonBtnAddtocartoTshirt();
		j.executeScript("scroll(-400,0)");
		product.clickonLogoofBucket();
		yourinfo.clickonCheckoutButton();
		yourinfo.enterFirstName("sandy");
		yourinfo.enterLastName("pawar");
		yourinfo.clickonContinoueButton();
		String actual_op=yourinfo.getErrormessage();
		System.out.println(actual_op);
		Assert.assertEquals(expected_op, actual_op);

	}

}
