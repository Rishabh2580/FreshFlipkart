package Flipkart.Flipkart;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import Pages.BasePage;
import Utility.ReadingPropertiesfile;
import XL.Sheet;
import XL.Sheet1;
import demolog.GenerateLogs;
import model.HomePage;
import model.Searchitem;
import model.crossbutton;

public class Test_3Searchitem extends BasePage {
	public static String sheetName = "Mydata";

	@Test
	public void yzx() throws InterruptedException {
		Searchitem p = new Searchitem(driver);
		String testname = "Test_3Searchitem";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
		crossbutton X = new crossbutton(driver);
		X.Cross();

		Logger log = Logger.getLogger(GenerateLogs.class);
		log.info("find successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		p.entersearchsection("Bag");
		log.info("enter bag successfully");
		p.searchhit();
		log.info("search successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(9000);
		p.verifyTitle();
	}
}
