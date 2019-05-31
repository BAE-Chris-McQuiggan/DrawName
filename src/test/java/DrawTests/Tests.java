package DrawTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tests {

	static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

	@Test
	public void test1() {
		Actions action = new Actions(driver);
		driver.navigate().to("https://www.youidraw.com/apps/painter/");
		WebElement paintBrush = driver.findElement(By.xpath("//*[@id=\"brush\"]"));
		paintBrush.click();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement paper = driver.findElement(By.xpath("//*[@id=\"painter\"]"));

		action.moveToElement(paper, 0, 0).perform();
		action.moveByOffset(120, 20).clickAndHold().moveByOffset(-100, 0).moveByOffset(0, 200).moveByOffset(100, 0)
				.release().perform();
		action.moveByOffset(30, -200).clickAndHold().moveByOffset(0, 200).moveByOffset(0, -100).moveByOffset(100, 0)
				.moveByOffset(0, 100).release().perform();
		action.moveByOffset(30, -110).clickAndHold().moveByOffset(0, 110).moveByOffset(0, -100).moveByOffset(75, 0)
				.release().perform();
		action.moveByOffset(30, -75).clickAndHold().moveByOffset(1, 1).moveByOffset(-1, -1).release()
				.moveByOffset(0, 75).clickAndHold().moveByOffset(0, 100).release().perform();
		action.moveByOffset(105, -100).clickAndHold().moveByOffset(-75, 0).moveByOffset(0, 50).moveByOffset(75, 0)
				.moveByOffset(0, 50).moveByOffset(-75, 0).release().perform();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
