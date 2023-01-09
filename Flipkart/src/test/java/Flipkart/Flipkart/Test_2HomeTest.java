package Flipkart.Flipkart;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pages.BasePage;
import Utility.ReadingPropertiesfile;
import XL.Sheet;
import demolog.GenerateLogs;
import io.github.bonigarcia.wdm.WebDriverManager;
import model.HomePage;
import model.crossbutton;

public class Test_2HomeTest extends BasePage {
	public static String sheetName = "Mydata";

	@Test
	public void Xyz() throws InterruptedException {
//crossbutton X = new crossbutton(driver);
//X.Cross();

		HomePage Loginpg = new HomePage(driver);
		String testname = "Test_2HomeTest";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Mode").toLowerCase();
		Sheet.toCheckExecutionRequired(executionRequired);
		Logger log = Logger.getLogger(GenerateLogs.class);
		Loginpg.logn();
		Loginpg.enterUsername("Rishabh");
		log.info("username fetch successfully");
		Loginpg.HitRequest();
		log.info("Hit request btn succesffully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Loginpg.HitCross();
		log.info("hit cross btn successfully");
	}
}
