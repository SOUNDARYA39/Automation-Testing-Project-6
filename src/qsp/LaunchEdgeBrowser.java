package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe" );
		WebDriver drivers=new EdgeDriver();
		drivers.get("https://www.selenium.dev/");

	}

}
