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
import model.Rightleft;
import model.crossbutton;

public class Test_10Footer extends BasePage {

	public static String sheetName = "Mydata";
	BasePage obj = new BasePage();

	@Test
	public void youtube() throws InterruptedException {
		Footer p = new Footer(driver);
		String testname = "Test_10Footer";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
//crossbutton X = new crossbutton(driver);
//X.Cross();
		Actions actions = new Actions(driver);
		Logger log = Logger.getLogger(GenerateLogs.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(9000);
		p.youtubehit();
		Thread.sleep(9000);
	}
}
