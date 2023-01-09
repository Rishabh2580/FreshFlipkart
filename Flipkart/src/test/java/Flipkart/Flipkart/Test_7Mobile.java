package Flipkart.Flipkart;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.BasePage;
import Utility.ReadingPropertiesfile;
import XL.Sheet;
import demolog.GenerateLogs;
import model.Groceryheader;
import model.crossbutton;
import model.mobileheader;

public class Test_7Mobile extends BasePage {
	public static String sheetName = "Mydata";
	BasePage obj = new BasePage();

	@Test
	public void mob() throws InterruptedException {
//crossbutton X = new crossbutton(driver);
//X.Cross();

		mobileheader p = new mobileheader(driver);
		String testname = "Test_7Mobile";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
		Logger log = Logger.getLogger(GenerateLogs.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		p.mobhhit();
		log.info("Hit mobile section successfully");
		p.oppohhit();
		log.info("Hit oppo btn successfully");
		p.comhhit();
		log.info("comhit btn successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		p.comhhit();
		log.info("Hit comhit btn successfully");
		p.verifyTitle();
		Thread.sleep(1000);
	}
}
