package Flipkart.Flipkart;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import Pages.BasePage;
import Utility.ReadingPropertiesfile;
import XL.Sheet;
import demolog.GenerateLogs;
import model.Groceryheader;
import model.crossbutton;

public class Test_6Grocery extends BasePage {
	public static String sheetName = "Mydata";
	BasePage obj = new BasePage();

	@Test
	public void Groc() throws InterruptedException {
		crossbutton X = new crossbutton(driver);
		X.Cross();
		Groceryheader p = new Groceryheader(driver);
		String testname = "Test_6Grocery";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
		Logger log = Logger.getLogger(GenerateLogs.class);
		p.Groceryhit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		log.info("Hit Grocery btn successfully");
		Thread.sleep(1000);
		p.entercodesection();
		log.info("enter info successfully");
		p.enteritemclick();
		log.info("enter info successfully");
		p.hitCartclick();
		log.info("Hit cart btn successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		p.Substractclick();
		log.info("Hit Substract btn successfully");
//p.verifyTitle();
	}
}
