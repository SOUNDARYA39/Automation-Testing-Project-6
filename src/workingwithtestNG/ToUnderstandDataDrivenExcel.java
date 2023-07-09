package workingwithtestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ToUnderstandDataDrivenExcel {
//FileInputStream fis=new FileInputStream(new File("./testData/testDriven.xlsx"));
@DataProvider
public String[][] logincred() throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream(new File("./testData/testDriven.xlsx"));
	 Workbook work = WorkbookFactory.create(fis);
	 Sheet loginsheet = work.getSheet("login");
	 int rowc=loginsheet.getPhysicalNumberOfRows()-1;
	 int colc=loginsheet.getRow(1).getPhysicalNumberOfCells();
	 
	 String [][] login=new String[rowc][colc];
	 for(int i=1,k=0; i<=rowc;i++,k++) {
		 for(int j=0;j<colc;j++) {
			login[k][j]=loginsheet.getRow(i).getCell(j).toString();
		 }
	 }
	return login;
	
}
@Test(dataProvider="logincred")
public void  actitime(String[] login) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demo.actitime.com/login.do");
	WebElement usn = driver.findElement(By.id("username"));
	usn.sendKeys(login[0]);
	Thread.sleep(5000);
	driver.findElement(By.name("pwd")).sendKeys(login[1]);
	Thread.sleep(5000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(10000);
	driver.quit();
	
}
}





