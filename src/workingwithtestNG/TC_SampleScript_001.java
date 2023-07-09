package workingwithtestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_SampleScript_001 {
	
	@Test (priority=-1)

	public void instagram() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		Thread.sleep(10);
		driver.close();
		
	}		
		;
		@Test (priority=0)

		public void facebook() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.facebook.com/");
			Thread.sleep(10);
			driver.close();
			
		}		
		
		
		
		 @Test (invocationCount=7 , threadPoolSize=2)

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
}
