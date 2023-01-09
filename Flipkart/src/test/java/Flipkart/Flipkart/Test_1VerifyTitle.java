package Flipkart.Flipkart;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.BasePage;
import Utility.ReadingPropertiesfile;
import XL.Sheet;
import demolog.GenerateLogs;
import model.crossbutton;

public class Test_1VerifyTitle extends BasePage {
	public static String sheetName = "Mydata";

	@Test(priority = 1)
	public void verifyTitle() {
		Logger log = Logger.getLogger(GenerateLogs.class);

//crossbutton X = new crossbutton(driver);
//X.Cross();
		String testname = "Test_1VerifyTitle";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
		String actualTitle = driver.getTitle();
		log.info("Title found successfully");
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Title Matched successfully");
	}

	@Test(priority = 2)
	public void verifyLogo() {
		Logger log = Logger.getLogger(GenerateLogs.class);
		boolean flag = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img"))
				.isDisplayed();
		Assert.assertTrue(flag);
		log.info("Logo found successfully");
	}
}