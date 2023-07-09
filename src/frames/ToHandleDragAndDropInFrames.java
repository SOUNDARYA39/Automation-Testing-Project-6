package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleDragAndDropInFrames {

	public static void main(String[] args) {
		
        System.setProperty("webdriver/chrome/driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Propagation");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,-500)");
        
      // WebElement framein = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded'][1]"));
        
       // driver.switchTo().frame(framein);
        
    //   WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        
     //  WebElement dest = driver.findElement(By.xpath("//p[text()='Inner droppable (greedy)']"));
        
       Actions act=new Actions(driver);
        
       // act.dragAndDrop(src, dest).perform();      
        
        driver.findElement(By.xpath("//li[text()='Photo Manager']")).click();
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded'][1]"));
        driver.switchTo().frame(frame1);
       WebElement src1 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
        
        WebElement dest1 = driver.findElement(By.id("trash"));
         act.dragAndDrop(src1, dest1).perform();
        
	}

}
