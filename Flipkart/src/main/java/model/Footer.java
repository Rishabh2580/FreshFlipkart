package model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Footer {
	WebDriver driver;

	public Footer(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")

	WebElement crossbtn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[4]/a[3]")
	WebElement youtube;

	public void crosshit() {

		crossbtn.click();

	}

	public void youtubehit() {

		youtube.click();

	}

}
