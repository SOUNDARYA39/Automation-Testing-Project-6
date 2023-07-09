package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabeledTextbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_text_disabled2");
        
        WebElement frames = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frames);
        
       WebElement dis = driver.findElement(By.id("myText"));
       driver.findElement(By.xpath("//button[text()='Disable Text field']")).click();
       Thread.sleep(4000);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        
        
        
        
        
	}

}
