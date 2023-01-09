package Flipkart.Flipkart;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Pages.BasePage;
import XL.Sheet;
import demolog.GenerateLogs;
import model.Header;
import model.crossbutton;

public class TestHeader extends BasePage {
	public static String sheetName = "Mydata";

	@Test(priority = 1)
	public void HeaderTest() throws InterruptedException {

		Header h = new Header(driver);
		String testname = "TestHeader";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
		crossbutton X = new crossbutton(driver);
		X.Cross();
		Logger log = Logger.getLogger(GenerateLogs.class);
		Thread.sleep(4000);
		h.click_Men();
		log.info("Clicked on item successfully");
	}

	@Test(priority = 2)
	public void electronic() throws InterruptedException {
		Header h = new Header(driver);
		Logger log = Logger.getLogger(GenerateLogs.class);
		Thread.sleep(4000);
		h.click_logo();
		log.info("Clicked on logo successfully");
		Thread.sleep(4000);
		h.click_audio();
		log.info("Clicked on audio successfully");
		Thread.sleep(4000);
	}


	@Test(priority = 3)
	public void beauty() throws InterruptedException {
		Header h = new Header(driver);
		Logger log = Logger.getLogger(GenerateLogs.class);

		h.click_logo();
		Thread.sleep(4000);
		h.click_beauty();
	}
	
	@Test(priority = 4)
	public void offer() throws InterruptedException {
		Header h = new Header(driver);
		Logger log = Logger.getLogger(GenerateLogs.class);
		h.click_logo();
		log.info("Clicked on logo successfully");

		Thread.sleep(4000);
		h.click_offer();
		log.info("Clicked on offer successfully");

		Thread.sleep(4000);
	}

	

	@Test(priority = 5)
	public void BecameSeller() throws InterruptedException {
		Header h = new Header(driver);
		Logger log = Logger.getLogger(GenerateLogs.class);

		h.click_logo();
		h.click_becameASeller();
		Thread.sleep(4000);
		h.click_enterNumber("9090128092");
		log.info("entered no successfully");

		h.click_sellingbtn();
		Thread.sleep(4000);
		h.click_sellerEmail("admin12@gmail.com");
		log.info("entered email successfully");

		h.click_enterGst("18AABCU9603R1ZM");

		log.info("entered Gst no successfully");

		h.click_registerbtn();

		log.info("Register hit successfully");
	}
	
	
	@Test(priority = 6)
	public void TwoWhellers() throws InterruptedException {
		Header h = new Header(driver);
		Logger log = Logger.getLogger(GenerateLogs.class);

		h.click_logo();
		log.info("Clicked on logo successfully");
		h.click_vehicle();
		log.info("Clicked on vehicle successfully");
		Thread.sleep(4000);
		h.click_logo();
	}
}



