package ai.sl.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import ai.sl.testbase.Testbase;

public class ScreenshotClass extends Testbase {
	
	public ScreenshotClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public static  void takeSS(String ssName) throws IOException
	{
		String path="C:\\Users\\ajitp\\eclipse_WorkplaceSandeep\\SwagLabWebSite\\screenshots\\";
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File des = new File(path+ssName+".png");
		FileHandler.copy(source, des);
		
	}
	
	public static String getdateAndtime()
	{
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date(); 
		    String ctime= formatter.format(date);
		    return ctime;
		     
	}

}
