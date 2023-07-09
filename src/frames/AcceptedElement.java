package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcceptedElement {

	public static void main(String[] args) {

        System.setProperty("webdriver/chrome/driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Propagation");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,-500)");
        
        driver.findElement(By.id("Accepted Elements")).click();        
        WebElement frames = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]"));
        driver.switchTo().frame(frames);
        
       WebElement src2= driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
       
WebElement dest2 = driver.findElement(By.id("droppable"));
       
      Actions act=new Actions(driver);
      
      act.dragAndDrop(src2, dest2).perform();
	}

	
	
		
	}


