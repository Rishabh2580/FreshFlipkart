package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesfile {

	public static Properties prop = null;
	public static File file = null;
	public static FileInputStream fis = null;

	
	static {
		{
			file = new File("C:\\Users\\rishabhsharma06\\eclipse-workspace\\Flipkart\\Config.Properties");
			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

	public static String getProperty(String key) {

		return prop.getProperty(key);

	}

}
