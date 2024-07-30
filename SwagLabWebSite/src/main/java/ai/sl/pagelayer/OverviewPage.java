package ai.sl.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ai.sl.testbase.Testbase;

public class OverviewPage extends Testbase {
	public OverviewPage() {
		PageFactory.initElements(driver,  this);
	}
	
	// object repo
	 private By button_finish=By.xpath(" //button[@id=\"finish\"]");
	 private By gettext_Thankyou=By.xpath(" //h2[@class=\"complete-header\"]");
	 
	 // action methods
	 
	 public String getTextofThankYou() {
			String text=driver.findElement(gettext_Thankyou).getText();
				return  text;
				
			}
			
	 public void clickonFinishButton() {
		 driver.findElement(button_finish).click();
	 }
}
