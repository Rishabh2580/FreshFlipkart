package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Resttestcases {

	WebDriver driver;

	public Resttestcases(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[4]/div/div[2]/div/div/div[1]/div/div[3]/div/a/div[1]/div/img")

	WebElement cofee;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[2]")

	WebElement scroll;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[2]/div[1]/div[2]/span")

	WebElement clear;

	@FindBy(xpath = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[2]/a[4]")

	WebElement faq;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/p")

	WebElement ques;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div/button[1]")

	WebElement yes;

	@FindBy(xpath = "//*[@id=\"container\"]/div/footer/div/div[2]/div[1]/div[4]/a[2]")

	WebElement Brandbtn;

	public void faqhit() {

		faq.click();

	}

	public void queshit() {

		ques.click();

	}

	public void yeshit() {
		yes.click();

	}

	public void cofeehit() {

		cofee.click();

	}

	public void scrollhit() {

		scroll.click();

	}

	public void clearhit() {

		clear.click();

	}

	public void Brandshit() {

		Brandbtn.click();

	}

}