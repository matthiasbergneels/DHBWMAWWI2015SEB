package kapitel11;

import java.io.IOException;

public class KeyboardInput {

	public static void main(String[] args) {
		
		
		byte[] buffer = new byte[5];
		
		System.out.println("Bitte etwas eingeben:");
		
		
		try {
			System.in.read(buffer, 0, buffer.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(buffer);
		System.out.println(new String(buffer));
		
		for(byte c : buffer){
			System.out.println((char)c);
		}

	}

}
