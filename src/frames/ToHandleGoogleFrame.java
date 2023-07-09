package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleGoogleFrame {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver/chrome/driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		WebElement frames = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frames);
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		driver.navigate().back();
		
		Thread.sleep(7000);
		
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 
		 //driver.findElement(By.id("APjFqb")).sendKeys("hello",Keys.ENTER);
		

	}

}
