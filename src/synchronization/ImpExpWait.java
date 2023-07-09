package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpExpWait {

	public static void main(String[] args) {
		//ChromeOptions option= new ChromeOptions();
	//	option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait explicitwait= new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.limeroad.com/feed?feed_kyc=true&top_level=Women");
		
		driver.findElement( By.id("home_category")).click();
		driver.findElement(By.className("dTc vM taL")).click();
		
		driver.findElement(By.xpath("//div[text()='ADD TO CART']")).click();
		
		
	
	}

}
