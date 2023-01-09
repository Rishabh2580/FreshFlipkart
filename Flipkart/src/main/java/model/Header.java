package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

	WebDriver driver;

	public Header(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Men's Top Wear")
	WebElement mens;

	public void click_Men() {
		Actions action = new Actions(driver);
		WebElement element = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		mens.click();
	}

	@FindBy(css = "div._36fx1h._6t1WkM._3HqJxg div._1YokD2._2GoDe3 div._1YokD2._3Mn1Gg.col-2-12:nth-child(1) div._1YokD2._3Mn1Gg.col-12-12 div._1AtVbE.col-12-12 div._1KOcBL section._167Mu3._2hbLCH:nth-child(8) div._3FPh42 div._2d0we9 div._4921Z.t0pPfW:nth-child(1) div._1Y4Vhm._4FO7b6 label._2iDkf8.t0pPfW > div._24_Dny")
	WebElement buyMore;

	public void click_buyMore() {
		buyMore.click();
	}

	@FindBy(linkText = "Delivery in 1 day")
	WebElement oneDayDelivery;

	public void click_oneDayDelivery() {

		oneDayDelivery.click();
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
	WebElement logo;

	public void click_logo() {
		logo.click();
	}

	@FindBy(linkText = "Audio")
	WebElement audio;

	public void click_audio() {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		audio.click();

	}

	@FindBy(xpath = "//div[contains(text(),'Top Offers')]")
	WebElement offers;

	public void click_offer() {
		offers.click();
	}

	@FindBy(linkText = "Beauty & Personal Care")
	WebElement smart;

	public void click_beauty() {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		smart.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Petrol Vehicles')]")
	WebElement motor;

	public void click_vehicle() {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[10]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		motor.click();

	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/span[1]")
	WebElement Seller;

	public void click_becameASeller() {
		Seller.click();
	}

	@FindBy(xpath = "//body/div[@id='app']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement enterno;

	public void click_enterNumber(String name) {
		enterno.click();
		enterno.sendKeys(name);
	}

	@FindBy(xpath = "//div[contains(text(),'Start Selling')]")
	WebElement sellingbtn;

	public void click_sellingbtn() {
		sellingbtn.click();
	}

	@FindBy(xpath = "//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/input[1]")
	WebElement selleremail;

	public void click_sellerEmail(String name) {
		selleremail.sendKeys(name);
	}

	@FindBy(xpath = "//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement Gsthit;

	public void click_enterGst(String name) {
		Gsthit.sendKeys(name);
	}

	@FindBy(xpath = "//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/footer[1]/button[1]")
	WebElement registerhit;

	public void click_registerbtn() throws InterruptedException {
		registerhit.click();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().back();
	}

}