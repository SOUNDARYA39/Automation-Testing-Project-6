package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testData {
	public String fromPropertyFile(String key) {
		FileInputStream fis=null;
		Properties properties=null;
		try
		
		{
			fis=new FileInputStream("./testData/configuraion.properties");
			properties=new Properties();
			properties.load(fis);
		}catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(key).toString();
	}

}
