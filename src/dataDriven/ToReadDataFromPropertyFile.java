package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		File abs = new File("./testData/configuration.properties");
		FileInputStream pass= new FileInputStream(abs);
		
		Properties property=new Properties();
		property.load(pass);
		
		
      String name = property.get("name").toString();
      System.out.println(name);
	}

}
