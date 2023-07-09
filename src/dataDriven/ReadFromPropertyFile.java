package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromPropertyFile {

	public static void main(String[] args) throws IOException {
	File path = new File("./testData/sample.properties");
	FileInputStream pathof=new FileInputStream(path);
	
	Properties prop=new Properties();
	prop.load(pathof);
	
	String key = prop.get("chromebrowser").toString();
	String value = prop.get("chromedriverpath").toString();
	
	String url = prop.get("url").toString();
	System.setProperty(key, value);
	
	WebDriver driver= new ChromeDriver();
	driver.get(url);

	}

}
