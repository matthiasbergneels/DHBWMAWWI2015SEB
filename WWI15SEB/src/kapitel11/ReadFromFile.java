package kapitel11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		
		File demoTextFile = new File(System.getProperty("user.dir") + "/filesystem/ReadDemo.txt");
		
		FileReader reader = null;
		try {
			reader = new FileReader(demoTextFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		try {
			String line;
			
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
