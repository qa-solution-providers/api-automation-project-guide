package utils;

/**
 * @author User : Samujjal Das Choudhury
 * 
 * This method reads property files and based on the property key
 * returns the corresponding value
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader {
	
	public static String getPropValue(String fileName, String propKey) {
		FileInputStream fis = null;
		String propVal = null;
		try {
			fis = new FileInputStream("src/test/resources/"+fileName+".properties");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
			propVal = prop.getProperty(propKey);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propVal;
		
		
	}

}
