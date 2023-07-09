package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollingbyOperator {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(1000));

	
	driver.get("https://www.google.com/doodles");
	
	   
	JavascriptExecutor js=  (JavascriptExecutor)driver;
	for(;;)
	{
		try {
		  driver.findElement(By.linkText("Esther Chapa Tijerina's 118th Birthday")).click();
		 break;
		}
		catch(NoSuchElementException e)
		{
			js.executeScript("window.scrollBy(0,1000)");
		
		}
	}
 
	
	
	
	 

	
	
	}

}
