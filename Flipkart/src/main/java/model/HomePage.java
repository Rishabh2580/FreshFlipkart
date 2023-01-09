package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")

	WebElement logn;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement usernamee;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement Requestbtn;

	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	WebElement Crossbtn;

	public void enterUsername(String uname) {

		usernamee.sendKeys("Rishabh");

	}

	public void HitRequest() {

		Requestbtn.click();

	}

	public void logn() {

		logn.click();

	}

	public void HitCross() {

		Crossbtn.click();

	}

}