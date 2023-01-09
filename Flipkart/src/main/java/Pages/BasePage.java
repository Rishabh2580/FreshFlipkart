package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import ExtentReporter.Extent;
import Utility.ReadingPropertiesfile;
import XL.Sheet;
import io.github.bonigarcia.wdm.WebDriverManager;
import model.Screenshot;

public class BasePage extends Sheet{
public static WebDriver driver = null;
public static ExtentReports extent;
public static ExtentTest test;
@BeforeSuite			
			
public void launchBrowser() throws IOException, InterruptedException
{				
String browserName =ReadingPropertiesfile.getProperty("browser");
			
if(browserName.equals("chrome")) {
extent = Extent.getInstance("ExtentReport/ExtentReports.html");
WebDriverManager.chromedriver().setup();
		  	       ChromeOptions options=new ChromeOptions();
			       options.addArguments("headless");
					driver=new ChromeDriver(options);
driver=new ChromeDriver();
			        
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			             
}
			
else if(browserName.equals("edge")) {
WebDriverManager.edgedriver().setup();
				EdgeOptions options=new EdgeOptions();
			options.addArguments("headless");
				driver=new EdgeDriver(options);
driver = new EdgeDriver();
Properties properties =  new Properties();
					
FileInputStream inputStream =new FileInputStream("C:\\Users\\rishabhsharma06\\eclipse-workspace\\Flipkart\\Config.Properties");
					
properties.load(inputStream);
String url = properties.getProperty("url");
					
driver.get(url);
driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		       
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
}
						
else {
				
System.out.println("No browser value is given");
				
}

}
			
private void open() {
		
		
}
		
@BeforeMethod
		
public void launchurl(Method method) throws IOException
{
			
test = extent.startTest(method.getName());
		
Properties properties =  new Properties();
			
		
			
FileInputStream inputStream =new FileInputStream("C:\\Users\\rishabhsharma06\\eclipse-workspace\\Flipkart\\Config.Properties");
				
properties.load(inputStream);
String url = properties.getProperty("url");
				
driver.get(url);
	  				
}
@AfterMethod
		
public void CloseBrowser(ITestResult result ) throws IOException
{
			
System.out.println(result.getMethod().getMethodName());	
if (result.getStatus()==ITestResult.FAILURE)
					
test.log(LogStatus.FAIL,result.getThrowable());
else if (result.getStatus()==ITestResult.SKIP)
test.log(LogStatus.SKIP,result.getThrowable());
				
				
else
					
test.log(LogStatus.PASS,"Test passes");
if(result.getStatus() == ITestResult.FAILURE) {
				
String imagePath = Screenshot.captureScreenshot(driver, result.getName());
test.log(LogStatus.FAIL, 
 test.addScreenCapture(imagePath));
				
}
			
else {
				
if(result.getStatus() == ITestResult.SUCCESS) {
					
test.log(LogStatus.PASS, "Test Case Pass");	
}
}
		
}
		
@AfterSuite
	
public void Close()
{
			
extent.flush();
driver.quit();				
			
}
}

