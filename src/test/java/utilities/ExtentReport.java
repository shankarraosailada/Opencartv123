package utilities;



import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testCases.Baseclass;

public class ExtentReport implements ITestListener {
	ExtentReports extent;
	ExtentSparkReporter sparkreporter;
	ExtentTest test;
	public void onStart(ITestContext context) {
		
		Date dt = new Date();
		String timestamp = dt.toString().replace(" ","_").replace(":","_");
		String reportname = "Test-Report" +timestamp+ ".html";
		sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//Reportname" +reportname);
		sparkreporter.config().setDocumentTitle("Opencart Automation Testing Project");
		sparkreporter.config().setReportName("OpenCart Functional Testing");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("Reportername","shankar");
		
		String operatingsystem = context.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("OperatingSystem", operatingsystem);
		
		String browsername = context.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browsername);
	}
		public void onTestSucess(ITestResult result) {
			test = extent.createTest(result.getTestClass().getName());
			test.log(Status.PASS,result.getName()+"test is passed");
		}
		
		public void onTestFailure(ITestResult result) {
			test = extent.createTest(result.getTestClass().getName());
			test.log(Status.FAIL,result.getName() +"test failed");
			test.log(Status.INFO,result.getThrowable().getMessage());
		
			String imgpath = new Baseclass().captureScreenShot(result.getName());
		    test.addScreenCaptureFromPath(imgpath);
		
		
	}
	

}
