   package ai.sl.pagelayer;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.sl.testbase.Testbase;

public class LoginPage extends Testbase {
	// pom approch1
	
	public   LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// obj repo
	@FindBy(xpath=" //input[@id=\"user-name\"]")
	private WebElement textbox_userName;
	@FindBy(xpath="//input[@id= \"password\"] ")
	private WebElement textbox_password;
	@FindBy(xpath="//input[@ id=\"login-button\"] ")
	private WebElement btn_login;
	
	//Action methods
	public void enterUserID(String userName)
	{
	textbox_userName.sendKeys(userName);	
	}

	public void enterPassword(String pass)
	{
	textbox_password.sendKeys(pass);	
	}
	
	public void clickonLogin()
	{
		btn_login.click();	
	}


}
