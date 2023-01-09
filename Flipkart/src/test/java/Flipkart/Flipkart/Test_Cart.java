package Flipkart.Flipkart;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Pages.BasePage;
import XL.Sheet;
import demolog.GenerateLogs;
import model.CartPage;
import model.crossbutton;

public class Test_Cart extends BasePage {
	public static String sheetName = "Mydata";

	@Test
	public void addToCart() throws InterruptedException {
		CartPage Search = new CartPage(driver);
		String testname = "Test_Cart";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
//crossbutton X = new crossbutton(driver);
//X.Cross();
		Logger log = Logger.getLogger(GenerateLogs.class);
		Search.Search_Text("Nokia");
		log.info("Mobile found successfully");
		Thread.sleep(9000);
		Search.Search_button();
		log.info("search btn found successfully");
		Thread.sleep(9000);
		Search.Product_Click();
		log.info("Product searchedfound successfully");
		Thread.sleep(9000);
		Search.AddTocart();
		log.info("item added in the  cart successfully found successfully");
		Thread.sleep(9000);
	}
}