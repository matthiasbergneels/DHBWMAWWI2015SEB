package kapitel11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWriteExample {

	public static void main(String[] args) {
		File propFileName = new File(System.getProperty("user.dir") + "/filesystem/demo.properties");
		
		try {
			FileOutputStream propFile = new FileOutputStream(propFileName);
			
			Properties prop = new Properties();
			
			prop.setProperty("Name", "Klaus");
			prop.setProperty("Geburtstag", "01.01.1990");
			
			prop.store(propFile, "Hier kommt ein Kommentar");
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
