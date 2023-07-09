package methodswd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		 String page=driver.getPageSource();
		 System.out.println(page);
	}

}
