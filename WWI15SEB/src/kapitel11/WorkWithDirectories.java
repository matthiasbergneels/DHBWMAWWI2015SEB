package kapitel11;

import java.io.File;

public class WorkWithDirectories {

	public static void main(String[] args) {
		
		File directory = new File("/Users/d041670/Development/Vorlesung/WWI15SEB/rep2/DHBWMAWWI2015SEB/WWI15SEB/filesystem/newDirectory");
		
		// Verzeichnis anlegen
		if(!directory.exists()){
			directory.mkdir();
			System.out.println("Verzeichnis wurde angelegt: " + directory.exists());
		}
		
		// Verzeichnis umbennen
		File directory2 = new File("/Users/d041670/Development/Vorlesung/WWI15SEB/rep2/DHBWMAWWI2015SEB/WWI15SEB/filesystem/newDirectory2");
		directory.renameTo(directory2);
		System.out.println("Verzeichnis wurde umbenannt!");
		System.out.println("Directory: " + directory.exists());
		System.out.println("Directory2: " + directory2.exists());
		
		// Verzeichnis löschen
		if(directory2.exists()){
			directory2.delete();
			System.out.println("Verzeichnis wurde gelöscht: " + !directory2.exists());
		}
	}

}
