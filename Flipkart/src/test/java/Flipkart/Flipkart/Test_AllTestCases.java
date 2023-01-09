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
import model.AllTestCases;
import model.Footer;
import model.Groceryheader;
import model.crossbutton;

public class Test_AllTestCases extends BasePage {
	public static String sheetName = "Mydata";
	BasePage t = new BasePage();

	@Test(priority = 1)
	public void first() throws InterruptedException {
		AllTestCases p = new AllTestCases(driver);
//crossbutton X = new crossbutton(driver);
		String testname = "Test_8LeftRight";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
//X.Cross();

		Logger log = Logger.getLogger(GenerateLogs.class);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		log.info("hit cross btn successfully");
		p.seller();
		log.info("hit Bestseller section successfully");

		p.sellingbtnn();

		log.info("hit selling btn successfully");

		p.registerbtnn();

		log.info("hit register btn successfully");

	}

	@Test(priority = 2)
	public void second() throws InterruptedException {
		AllTestCases p = new AllTestCases(driver);

		Logger log = Logger.getLogger(GenerateLogs.class);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		log.info("hit cross btn successfully");

		p.flightbtnn();
		log.info("hit flight btn successfully");

		p.fromsection("Gwalior");
		log.info("Enter info successfully");

		p.Toosection("Delhi");
		log.info("Enter info successfully");

		p.searchsection();

		log.info("searched  successfully");

	}

	@Test(priority = 3)

	public void Third() throws InterruptedException {

		AllTestCases p = new AllTestCases(driver);

		Logger log = Logger.getLogger(GenerateLogs.class);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		log.info("hit cross btn successfully");

		p.Bikesection();
		log.info("Found Bike section successfully");

		Actions act = new Actions(driver);

		Thread.sleep(5000);

	}

	@Test(priority = 4)

	public void fifth() throws InterruptedException {

		AllTestCases p = new AllTestCases(driver);

		Logger log = Logger.getLogger(GenerateLogs.class);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		log.info("hit cross btn successfully");

		p.Appliance();
		log.info("hit Appliance page successfully");

		p.Pageff();

		p.Reff();

		log.info("done last action  successfully");

	}
}
