package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
    FileInputStream fis=new FileInputStream(new File("./testData/string.xlsx"));
    
    Workbook work=WorkbookFactory.create(fis);
    
    Sheet info = work.getSheet("informaton");
   int rowcount = info.getPhysicalNumberOfRows();
   int colcount = info.getRow(0).getPhysicalNumberOfCells();
   
   String [][] sarr= new String [rowcount] [colcount];
   
   for(int i=0;i<rowcount;i++)
   {
	   for(int j=0;j<colcount;j++)
	   {
		  sarr [i][j]= info.getRow(i).getCell(j).toString();
	   }
   }
   
   for(String[] arr : sarr) {
	   for(String data : arr)
	   {
		   System.out.print(data+" ,");
	   }
	   System.out.println();
   }
	}

}
