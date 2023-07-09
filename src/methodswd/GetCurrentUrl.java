package methodswd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://omayo.blogspot.com/");
	System.out.println(driver.getCurrentUrl());
	}

}
