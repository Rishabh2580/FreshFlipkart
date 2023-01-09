package XL;

import org.apache.log4j.Logger;
import org.testng.SkipException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.BasePage;
import Utility.ReadingPropertiesfile;

public class Sheet {

	public static final Logger log = Logger.getLogger(Sheet.class);
	public static Sheet1 reader = null;
	public static ExtentReports extent;
	public static ExtentTest test;
	static {
		try {

			reader = new Sheet1(ReadingPropertiesfile.getProperty("Excel_Path"));
		} catch (Exception e) {

			log.error(e.getMessage());
		}
	}

	public static void toCheckExecutionRequired(String executionRequired) {


		if (executionRequired.equals("no")) {

			BasePage.test.log(LogStatus.WARNING, "Execution Required : " + executionRequired.toUpperCase());
			log.info("Execution required is no , skipping the test");
			throw new SkipException("Skipping this exception");
		}

	
		if (executionRequired.equals("")) {

			BasePage.test.log(LogStatus.WARNING, "Execution Required : " + executionRequired.toUpperCase());
			log.info("Execution required is empty , skipping the test");
			throw new SkipException("Skipping this exception");
		}
	}
}
