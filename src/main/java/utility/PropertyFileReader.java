package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	static File proFile;
	static FileInputStream fis;
	public static String getLocator(String key)
	{
		
		proFile = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\utility\\selenium.properties");
		try {
			fis = new FileInputStream(proFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pro= new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=pro.getProperty(key);
		return value;
	}

}
