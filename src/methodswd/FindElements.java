package methodswd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.google.co.in/");
		Thread.sleep(4000);
		 driver.switchTo().activeElement().sendKeys("bike");
		 Thread.sleep(3000);
		 List<WebElement> bike = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		 Thread.sleep(500);
		 
		// for(int i=0;i<bike.size();i++)
		// {
		//	String options = bike.get(i).getText();
		//	System.out.println(options);
			 
		// }
		 for(WebElement we : bike)
		 {
			String option = we.getText() ;
			System.out.println(option);
		 }
		
	}

}
