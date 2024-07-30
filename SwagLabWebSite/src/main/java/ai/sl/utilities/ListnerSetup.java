package ai.sl.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerSetup implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test execution Started");
		 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test execution Completed");
		 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 
		try {
//			 String getmethodName=result.getName();
//			 String getdateandtime=ScreenshotClass.getdateAndtime();
//			 String methodnameandtime=getmethodName+getdateandtime;
//			 System.out.println( methodnameandtime);
			ScreenshotClass.takeSS(result.getName()+System.currentTimeMillis() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test execution Failed");
		 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test execution Skipped");
		 
	}

	
	

	 

}
