package ai.sl.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ai.sl.testbase.Testbase;

public class YourinformationtPage extends Testbase {
	public YourinformationtPage() {
		PageFactory.initElements(driver, this);
	}

	// obje repo
	private By btn_Chekout = By.xpath("//button[@name=\"checkout\"] ");
	private By txtbox_firstname = By.xpath(" (//input[@class=\"input_error form_input\"])[1]");
	private By txtbox_Lastname = By.xpath("//input[@data-test=\"lastName\"] ");
	private By txtbox_postalcode = By.xpath(" //input[@data-test=\"postalCode\"]");
	 private By button_continue=By.xpath("//input[@type=\"submit\"]");
	 private By msg_error=By.xpath( "//h3[@data-test=\"error\"]");

	// actionMethods
	 public String getErrormessage() {
		String text= driver.findElement(msg_error).getText();
		return text;
	 }
	 
	public void clickonContinoueButton() {
		driver.findElement(button_continue).click();	}
	 
	public void enterFirstName(String name) {
		driver.findElement(txtbox_firstname).sendKeys(name);
		
	}
	
	public void enterLastName(String lname) {
		driver.findElement(txtbox_Lastname).sendKeys(lname);	
	}
	public void enterPostCode(String code) {
		driver.findElement(txtbox_postalcode).sendKeys(code);	
	}
	
	public void clickonCheckoutButton() {
		driver.findElement(btn_Chekout).click();
	}
	
	

}
