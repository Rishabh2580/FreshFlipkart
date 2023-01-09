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
import model.Rightleft;
import model.crossbutton;
import model.mobileheader;

public class Test_8LeftRight extends BasePage {
	public static String sheetName = "Mydata";
	BasePage obj = new BasePage();

	@Test
	public void LRB() throws InterruptedException {
//crossbutton X = new crossbutton(driver);
//X.Cross();
		Rightleft p = new Rightleft(driver);
		String testname = "Test_8LeftRight";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
		Logger log = Logger.getLogger(GenerateLogs.class);
		log.info("Hit cross btn successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		p.Righthit();
		log.info("Hit Right btn successfully");
		p.lefthit();
		log.info("Hit left btn successfully");
		p.verifytitle();
		Thread.sleep(10000);

	}
}