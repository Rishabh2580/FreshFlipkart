package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Searchitem {

	WebDriver driver;
	String expectedtitle = "Bag- Buy Products Online at Best Price in India - All Categories | Flipkart.com";

	public Searchitem(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	WebElement crossbtn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement searchsection;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	WebElement Searchclickbtn;

	public void entersearchsection(String uname) {

		searchsection.sendKeys("Bag");

	}

	public void searchhit() {

		Searchclickbtn.click();

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
