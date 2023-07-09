package popups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleHiddenDivisionPopup {

	public static void main(String[] args) {
		 LocalDateTime sdt = LocalDateTime.now().plusYears(1);
		System.out.println(sdt);
		String month = sdt.getMonth().name();
		System.out.println(month);
		int year = sdt.getYear();
		System.out.println(year);
		
		int day = sdt.getDayOfMonth();
		
		String monthin = month.charAt(0)+month.substring(1, month.length()).toLowerCase();
		System.out.println(monthin);
		System.setProperty("webdriver/chrome/driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.goibibo.com/flights/");
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		for(;;)
		{
			try {
				driver.findElement(By.xpath("//div[text()='"+monthin+" "+year+"']/../..//p[text()='"+day+"']")).click();
	            break;
			}
			catch(NoSuchElementException e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		
	}

}
