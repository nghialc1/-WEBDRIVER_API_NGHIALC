package selenium_api;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_01_CheckEvironment {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		// Chrome
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		driver = new ChromeDriver();

		// Firefox
//		driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void TC_01_CheckTitle() {
		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, "Google");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
