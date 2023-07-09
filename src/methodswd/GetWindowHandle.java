package methodswd;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com/");
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
	}

}
