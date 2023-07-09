package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	WebElement frameelement = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameelement);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promptalert = driver.switchTo().alert();
		Thread.sleep(15);
		System.out.println(promptalert.getText());
		Thread.sleep(15);
		promptalert.sendKeys("SOUNDARYA G");
		Thread.sleep(15);
		promptalert.accept();
	}

}
