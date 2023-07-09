package methodswd;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension targetsize = new Dimension(250,350);
		driver.manage().window().setSize(targetsize);
		Point targetsize1 = new Point(23,450);
		driver.manage().window().setPosition(targetsize1);
		
	}

}
