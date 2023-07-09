package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class XpathDENIND {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver(opt);
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10' and text()='Departure']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//div[text()='April 2023']/../..//p[text()='18']")).click();
	  Thread.sleep(4000);
	  driver.close();
	
	}
}
