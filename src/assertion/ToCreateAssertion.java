package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToCreateAssertion {
	@Test
	public void assertpractice() throws InterruptedException {
		String expectedtitle="actiTIME - Login";
		String username="admin";
		String password="manager";
		
		String exhomepagetitle="actiTIME - Enter Time-Track";
		
		System.setProperty("wedriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		SoftAssert sa=new SoftAssert();
		driver.get("https://demo.actitime.com/login.do");
		String actualtitle= driver.getTitle();
		sa.assertEquals(actualtitle, expectedtitle," login is not displayed");
		
		WebElement usn = driver.findElement(By.id("username"));
		usn.clear();
		usn.sendKeys(username);
		sa.assertEquals(usn.getAttribute("value"), username, "user is not displayed");
		Thread.sleep(5000);
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys(password);
		sa.assertEquals(pwd.getAttribute("value"), password, "password is not displayed ");
		Thread.sleep(10000);
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		String ahomepagetitle=driver.getTitle();
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		sa.assertEquals(ahomepagetitle, exhomepagetitle, "home page is not displayed");
		
		sa.assertAll();
		
	}

}
