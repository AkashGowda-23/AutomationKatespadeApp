package TestCases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utils.BaseTest;

public class Listners implements ITestListener {
	
	ExtentTest test;
	WebDriver driver;
	ExtentReports report=BaseTest.getreport();
	public void onTestStart(ITestResult result) {
		test= report.createTest(result.getName());
		
	}
	public void onTestFailure(ITestResult result) {
	    System.out.println("This is a failed test: " + result.getName());
	    test.fail(result.getThrowable(), null);
	    try {
	        driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	        System.out.println("Driver: " + driver);
	        
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        System.out.println("Source File Path: " + src.getAbsolutePath());
	        
	        File des = new File("C:\\Users\\Akash Gowda\\Documents\\Ui\\target" + System.currentTimeMillis() + ".png");
	        
	        System.out.println("Destination File Path: " + des.getAbsolutePath());
	        
	        String errpath = des.getAbsolutePath();
	        FileUtils.copyFile(src, des);
	        test.addScreenCaptureFromPath(errpath);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

		
	
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS,"the test is passed");
		
	}
	public void onFinish(ITestContext context) {
		report.flush();
	}
	
	

	

}
