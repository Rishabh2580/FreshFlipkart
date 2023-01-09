package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Rightleft {

	WebDriver driver;
	String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	public Rightleft(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")

	WebElement crossbtn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[3]")

	WebElement right;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]")

	WebElement left;

	public void Righthit() {

		right.click();

	}

	public void lefthit() {

		left.click();

	}

	public void crosshit() {

		crossbtn.click();

	}

	public void verifytitle() {

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
//Assert.assertEquals(actualTitle,expectedtitle);

	}
}