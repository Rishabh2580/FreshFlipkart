package model;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.ReadingPropertiesfile;
import demolog.GenerateLogs;

public class mobileheader {

	WebDriver driver;

	String expectedtitle = "Mobile Price List | Compare Mobiles on Buy Online @ Flipkart.";

	public mobileheader(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")

	WebElement crossbtn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[2]")

	WebElement mobhit;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div/a/div/img")
	WebElement oppo;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[1]/div[2]/div/span/label/div")

	WebElement comtick;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[4]/div/a")

	WebElement commmtick;

	public void mobhhit() {

		mobhit.click();

	}

	public void oppohhit() {

		oppo.click();

	}

	public void comhhit() {

		comtick.click();

	}

	public void commhhit() {

		commmtick.click();

	}

	public void crosshit() {

		crossbtn.click();

	}

	public void verifyTitle() {

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedtitle);

	}
}
