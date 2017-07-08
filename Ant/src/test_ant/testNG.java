package test_ant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class testNG {
	public WebDriver driver;
	String baseUrl = "http://www.sogou.com";

	@Test
	public void test_Sogou() {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement input = driver.findElement(By.id("query"));
		Assert.assertTrue(input.isDisplayed());
	}

	@BeforeMethod
	public void beforeMethod() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Eclipse\\AutoTest\\Surface\\Ant\\chromedriver.exe");
		 * DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		 * capabilities.setCapability("chrome.switches",
		 * Arrays.asList("--incognito")); ChromeOptions options = new
		 * ChromeOptions(); options.addArguments("--test-type");
		 * capabilities.setCapability("chrome.binary",
		 * "D:\\Eclipse\\AutoTest\\Surface\\Ant\\chromedriver.exe");
		 * capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		 */
		driver = new FirefoxDriver();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
