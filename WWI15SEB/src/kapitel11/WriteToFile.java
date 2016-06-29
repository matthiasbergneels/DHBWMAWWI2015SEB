package kapitel11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		File demoWriteText = new File(System.getProperty("user.dir") + "/filesystem/WriteDemo.txt");
		
		if(!demoWriteText.exists()){
			try {
				demoWriteText.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(demoWriteText, true);
			
			writer.append("Hier schreiben wir Text rein mit append!!.\n");
			writer.append("Hier schreiben wir Text rein mit zweiter Zeile.\n");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			
			try {
				writer.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		

	}

}
