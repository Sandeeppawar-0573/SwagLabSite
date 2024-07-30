package ai.sl.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

import ai.sl.testbase.Testbase;

public class ProductPage extends Testbase {
	//pom approch2
   
	public  ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//object repo or webelements
	private By menu=By.xpath("//button[@id=\"react-burger-menu-btn\"]");
	private By btn_logout=By.xpath("//a[@id=\"logout_sidebar_link\"]");
	private By btn_addtoCart= By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]");
	private By btn_remove= By.xpath("//button[@id=\"remove-sauce-labs-backpack\"]");
	//private WebElement btn_filter= By.xpath("//select[@class=\"product_sort_container\"]");
	@FindBy(xpath="//select[@class=\"product_sort_container\"]")
	private WebElement btn_filter;
	private By filterbox_text= By.xpath("//span[@class=\"active_option\"]");
	
	private By btn_addtocartofbackpack=By.xpath( "(//button[text()=\"Add to cart\"])[1]");
	private By btn_addtocartoftshirt	=By.xpath(" (//button[text()=\"Add to cart\"])[5]");
	private By logo_bucket=By.xpath( "//a[@ class=\"shopping_cart_link\"]");
	private By logo_backpack=By.xpath("//img[@alt=\"Sauce Labs Backpack\"]");
	
	// action methods
	
	public boolean checklogoofBackpack() {
		boolean b_result=driver.findElement(logo_backpack).isDisplayed();
		return b_result;
	}
	public void clickonLogoofBucket() {
		driver.findElement(logo_bucket).click();
	}
	public void clickonBtnAddtocartoTshirt() {
		driver.findElement(btn_addtocartoftshirt).click();
	}
	public void clickonBtnAddtocartoBackPack() {
		driver.findElement(btn_addtocartofbackpack).click();
	}
	public void clickonMenuBar()
	{
		driver.findElement(menu).click();
	}
	
	public void clickonlogout()
	{
		driver.findElement(btn_logout).click();
	}
	
	public void clickonAddtoCart()
	{
		driver.findElement(btn_addtoCart).click();
	}
	
	public String getTextonAddtoCartButton()
	{
		String text=driver.findElement(btn_remove).getText();
		return text;
	}

	 public void selectProductNameZtoA()
	 {
		 Select s= new Select(btn_filter); 
		 s.selectByValue("za");
		 
	 }
	 
	 public void selectProductPriceHightoLow()
	 {
		 Select s= new Select(btn_filter); 
		 s.selectByIndex(3);
		 
	 }
	 
	 public String getTextonFilterBox()
	 {
		 String txtbox_filter =driver.findElement(filterbox_text).getText();
		 return txtbox_filter;
	 }
	
}
