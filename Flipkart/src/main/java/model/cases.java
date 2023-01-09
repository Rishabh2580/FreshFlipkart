package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cases {
	WebDriver driver;

	public cases(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[1]/a[7]")
	WebElement corporate;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[2]/a[1]/div/div[2]/span")
	WebElement annualreturn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/footer/div/div[2]/div[2]/div/div[4]/a")
	WebElement telephone;

	public void corporatehit() {
		corporate.click();

	}

	public void annualreturnhit() {
		annualreturn.click();

	}

	public void telephonehit() {
		telephone.click();

	}

}
