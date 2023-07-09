package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

FileInputStream fis=new FileInputStream(new File("./testData/testDriven.xlsx"));

Workbook work=WorkbookFactory.create(fis);

double num = work.getSheet("number").getRow(1).getCell(0).getNumericCellValue();
String name = work.getSheet("name").getRow(5).getCell(2).getStringCellValue();
boolean bol = work.getSheet("boolean").getRow(8).getCell(0).getBooleanCellValue();
Date date = work.getSheet("date").getRow(2).getCell(0).getDateCellValue();

System.out.println(num);
System.out.println(name);
System.out.println(bol);
System.out.println(date);

	}

}
