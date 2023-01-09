package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllTestCases {
	WebDriver driver;

	public AllTestCases(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")

	WebElement crossbtn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/a")

	WebElement S;

	public void crossbb() {

		crossbtn.click();

	}

	public void seller() {

		S.click();

	}

	@FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div/div/div/div[2]/button/div[1]")

	WebElement sellingbtn;

	public void sellingbtnn() {

		sellingbtn.click();

	}

	@FindBy(xpath = "//*[@id=\"app-container\"]/div/div[1]/div/form/footer/button/span")

	WebElement Register;

	public void registerbtnn() {

		Register.click();

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[7]/a/div[1]/div/img ")

	WebElement flight;

	public void flightbtnn() {

		flight.click();

	}

	@FindBy(xpath = " //*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/div[1]/div[1]/input")

	WebElement From;

	public void fromsection(String uname) {

		From.sendKeys("Gwalior");

	}

	@FindBy(xpath = " //*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]/div[1]/input ")

	WebElement Too;

	public void Toosection(String uname) {

		Too.sendKeys("Delhi");

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/button ")

	WebElement Searchbtn;

	public void searchsection() {

		Searchbtn.click();

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[10]/a/div[2]/div[1]/div")

	WebElement B;

	public void Bikesection() {

		B.click();

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[10]/a/div[2]/div[2]/div[2]/div/div/div/a[1]")

	WebElement Petrol;

	public void Petrolsection() {

		Petrol.click();

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/a")

	WebElement Viewall;

	public void Viewalls() {

		Viewall.click();

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[1]/div/img")

	WebElement Appliances;

	public void Appliance() {

		Appliances.click();

	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")

	WebElement crossbtnn;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[4]/div/div[2]/a/div/div/img[2]")

	WebElement Pagef;

	public void Pageff() {

		Pagef.click();

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")

	WebElement ref;

	public void Reff() {

		ref.click();

	}

	public void crosshit() {

		crossbtn.click();

	}
}
