package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class crossbutton {
	WebDriver driver;

	public crossbutton(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")

	WebElement X;

	public void Cross() {

		X.click();

	}

}