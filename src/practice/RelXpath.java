package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelXpath {

	public static void main(String[] args) {
//div[@class='form_group']
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/?ref=hackernoon.com");
	   WebElement element = driver.findElement(By.xpath("//div[@class='form_group']"));
	
	        String ele = element.getAttribute("class");
			String tele = element.getTagName();
			System.out.println("<"+tele+" class="+ ele +">"+"<"+"/"+tele+">");
			

}
}	
