package kapitel11;

import java.io.File;
import java.io.IOException;

public class WorkingWithFiles {

	public static void main(String[] args) {
		
		File newFile = new File(System.getProperty("user.dir") + "/filesystem/neueDatei.txt");
		
		
		// Datei anlegen
		if(!newFile.exists()){
			
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Datei wurde angelegt: " + newFile.exists());
		}
		
		// Datei umbenennen
		File newFile2 = new File(System.getProperty("user.dir") + "/filesystem/neueDatei_Renamed.txt");
		
		//if(newFile.exists()){
			newFile.renameTo(newFile2);
			System.out.println("Datei wurde umbenannt!");
			System.out.println("NewFile: " + newFile.exists());
			System.out.println("NewFile: " + newFile2.exists());
		//}
		
		// Datei löschen
		if(newFile2.exists()){
			newFile2.delete();
			System.out.println("Datei gelöscht: " + !newFile2.exists());
		}
	}

}
