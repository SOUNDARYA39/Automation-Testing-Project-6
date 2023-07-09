package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWait {



	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait explicitWait =new WebDriverWait(driver,Duration.ofSeconds(15));
		
		 driver.findElement(By.id("firstName")).sendKeys("sdjhjd");
		
		driver.findElement(By.id("lastName")).sendKeys("jfjdjf");
		
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//span[text()='Next']"));
		
		explicitWait.until(ExpectedConditions.elementToBeClickable(loginbutton));
		loginbutton.click();
		

	}

	

	
		
	}


