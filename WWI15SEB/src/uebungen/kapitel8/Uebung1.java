package uebungen.kapitel8;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung1 {
	public static void main(String[] args) throws IOException {
		FileWriter datei = null;
		

		String text;
		

		datei = new FileWriter("ausgabe.txt");

		
		text = "1\n";for(int i = 2; i <=100; i++) {
			text += i;text += "\n";
		}
		
		try {
			datei.write(text, 0, text.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			datei.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			datei.close();
		}
		
		}
	}
