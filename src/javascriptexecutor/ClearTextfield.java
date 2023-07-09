package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextfield {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		WebElement text = driver.findElement(By.xpath("//option[text()='India']"));

		//JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("arguments[0].value=" ";", text);

	}

}
