package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenShotUsingRemoteWebDriverClass {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.glassdoor.com/Award/Best-Places-to-Work-LST_KQ0,19.htm");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		//downcasting...
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
	
		File src = rwd.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshot/glassdoor.png");
		Files.copy(src, dest);
	}

}
