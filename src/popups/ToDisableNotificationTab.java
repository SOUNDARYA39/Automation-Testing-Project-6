package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDisableNotificationTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver/chrome/driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(co);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(20);
	
		

	}

}
