package model;

import java.util.Iterator;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Pages.BasePage;

public class CartPage extends BasePage {
	WebDriver driver;

	public CartPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div/img")

	WebElement ClickProduct;
	


	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")

	WebElement CartButton;

	@FindBy(xpath = "//input[@name='q']")

	WebElement SrchTxt;

	@FindBy(xpath = "//input[@name='q']")

	WebElement SrchBtn;

	public void Search_Text(String uname) {
		SrchTxt.sendKeys("Nokia");
	}

	public void Search_button() {
		SrchTxt.sendKeys(Keys.RETURN);
	}

	public void Product_Click() {
		ClickProduct.click();
	}

	public void AddTocart() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		Set<String> windowhandles = driver.getWindowHandles();

		Iterator<String> iterator = windowhandles.iterator();

		String parentWindow = iterator.next();

		String childWindow = iterator.next();

		driver.switchTo().window(childWindow);

		jse.executeScript("window.scrollBy(0,40)", "");

		CartButton.click();

		Thread.sleep(4000);

		String expected_Cart_Title = "Shopping Cart | Flipkart.com";

		String actual_Cart_Title = driver.getTitle();

		System.out.print(actual_Cart_Title);

		Assert.assertEquals(actual_Cart_Title, expected_Cart_Title);
	}
}
