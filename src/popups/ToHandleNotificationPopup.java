package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleNotificationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver/chrome/driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(20);
		
		//Robot robot= new Robot();
	//	robot.keyPress(KeyEvent.VK_TAB);
	//	robot.keyRelease(KeyEvent.VK_TAB);
	//	Thread.sleep(4);
	//	robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		
		Runtime.getRuntime().exec("./autoit programs/notification.exe");
		
		
	}

}
