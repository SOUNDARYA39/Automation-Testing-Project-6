package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleFilePopupusingAutoIt {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver/chrome/driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.resizepixel.com/");
		driver.findElement(By.xpath("//label[@class='btn btn-success text-uppercase mb-2']")).click();
		
		//driver.findElement(By.id("uploadImageBtn")).click();
		
		Runtime.getRuntime().exec("./autoit programs/FileUpload.exe");

	}

}
