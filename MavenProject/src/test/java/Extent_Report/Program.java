package Extent_Report;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Program {
	@Test
	public void report()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String screen_shot=driver.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter esp= new ExtentSparkReporter("Extent Report//Attched_report.html");
		ExtentReports er = new ExtentReports();
		er.attachReporter(esp);
		ExtentTest test= er.createTest("program");
		test.log(Status.INFO, "Test case attached with extent report");
		test.addScreenCaptureFromBase64String(screen_shot);
		er.flush();
	}

}
