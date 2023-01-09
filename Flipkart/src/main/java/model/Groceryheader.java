package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Groceryheader {
	WebDriver driver;

	String expectedtitle = "Shopping Cart | Flipkart.com\r\n";

	public Groceryheader(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")

	WebElement crossbtn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div")
	WebElement Grocery;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div/button")
	WebElement Codebox;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[4]/div[5]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div/button/span")

	WebElement Additem;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[6]/div/div/a")

	WebElement cart;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/div[1]/div/div[3]/div/div[2]/div[1]/button")

	WebElement Substract;

	public void Groceryhit() {

		Grocery.click();

	}

	public void entercodesection() {

		Codebox.click();

	}

	public void enteritemclick() {

		Additem.click();

	}

	public void hitCartclick() {

		cart.click();

	}

	public void Substractclick() {

		Substract.click();

	}

	public void crosshit() {

		crossbtn.click();

	}

	public void verifyTitle() {

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		// Assert.assertEquals(actualTitle,expectedtitle);

	}
}