package kapitel11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputString {

	public static void main(String[] args) {
		
		InputStreamReader strReader = new InputStreamReader(System.in);
		BufferedReader bufString = new BufferedReader(strReader);
		
		System.out.println("Bitte Text eingeben:");
		
		try {
			
			String input = bufString.readLine();
			System.out.println(input);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
