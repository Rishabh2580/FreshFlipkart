package demolog;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLogs {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(GenerateLogs.class);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rishabhsharma06\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.info("launching browser");
		driver.get(
				"https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58575554323%26hvpone%3D%26hvptwo%3D%26hvadid%3D617724335962%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D1071951864624678571%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9302218%26hvtargid%3Dkwd-64910771%26hydadcr%3D15413_2322997%26gclid%3DCj0KCQjw7KqZBhCBARIsAI-fTKKeS37l3gy6I8bY6q0gI7BRvAWSWvpMJ8M_tnuNGSRe0z-PLEJk8loaAkw-EALw_wcB&prevRID=GHCPNCGNNTS029YNA80J&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		log.info("google url has been launched");
		String title = driver.getTitle();
		System.out.println("title value is" + title);
		log.info("title value is" + title);
		if (title.equals("Google")) {
			System.out.println("correct title is google");
			log.info("correct title is google and test case is passed");
		} else {

			System.out.println("correct title is not google");
			log.info("correct title is google and test case is Failed");
		}

	}
}