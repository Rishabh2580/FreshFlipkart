package Flipkart.Flipkart;

import java.time.Duration;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.BasePage;
import XL.Sheet;
import demolog.GenerateLogs;
import model.cases;
import model.crossbutton;

public class Test_cases extends BasePage {
	public static String sheetName = "Mydata";
	BasePage t = new BasePage();

	@Test(priority = 1)
	public void cases() throws InterruptedException {
		cases p = new cases(driver);
		String testname = "Test_cases";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
//crossbutton X = new crossbutton(driver);
//X.Cross();

		Logger log = Logger.getLogger(GenerateLogs.class);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "400000");
		p.corporatehit();
		p.annualreturnhit();
		Thread.sleep(900);
	}

	@Test(priority = 3)
	public void verifyTitle() {

		Logger log = Logger.getLogger(GenerateLogs.class);
		String actualTitle = driver.getTitle();
		log.info("Title found successfully");

		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(actualTitle, expectedTitle);

		log.info("Title Matched successfully");

	}

	@Test(priority = 4)

	public void verifyLogo() {
		Logger log = Logger.getLogger(GenerateLogs.class);

		boolean flag = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img"))
				.isDisplayed();

		Assert.assertTrue(flag);
		log.info("Logo found successfully");
	}
}
