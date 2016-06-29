package kapitel11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		
		File source = new File(System.getProperty("user.dir") + "/filesystem/eclipse.png");
		File target = new File(System.getProperty("user.dir") + "/filesystem/eclipse_copy.png");
		
		FileInputStream reader = null;
		FileOutputStream writer = null;
		
		byte[] content = new byte[(int)source.length()];
		
		try {
			reader = new FileInputStream(source);
			writer = new FileOutputStream(target);
			
			int bytesRead = reader.read(content);
			System.out.println(new String(content));
			
			writer.write(content, 0, bytesRead);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				writer.close();
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
