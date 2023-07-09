package workingwithtestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_SampleScript_002

{
	 @Test (invocationCount=2, threadPoolSize=5)

		public void twitter() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://twitter.com/i/flow/login");
			Thread.sleep(10);
			driver.close();
			
		}
	 @Test (timeOut=10000)

		public void shopperstalk() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(10);
			driver.close();
			
		}

}
