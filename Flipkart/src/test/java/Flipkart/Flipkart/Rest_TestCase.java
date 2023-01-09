package Flipkart.Flipkart;

import java.time.Duration;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Pages.BasePage;
import Utility.ReadingPropertiesfile;
import XL.Sheet;
import demolog.GenerateLogs;
import model.Footer;
import model.Resttestcases;
import model.crossbutton;

public class Rest_TestCase extends BasePage {
	public static String sheetName = "Mydata";
	BasePage obj = new BasePage();

	@Test
	public void faqcase() throws InterruptedException {
		Resttestcases p = new Resttestcases(driver);
//crossbutton X = new crossbutton(driver);
//X.Cross();
		Actions actions = new Actions(driver);
		String testname = "Rest_TestCase";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
		Logger log = Logger.getLogger(GenerateLogs.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		p.faqhit();
		p.queshit();
		p.yeshit();
		Thread.sleep(900);
	}
}