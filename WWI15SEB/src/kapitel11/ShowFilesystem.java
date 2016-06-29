package kapitel11;

import java.io.File;

public class ShowFilesystem {

	public static void main(String[] args) {
		
		File[] roots = File.listRoots();
		
		for(File root : roots){
			System.out.println("Name: " + root.getPath() + ", ist aktiv: " + root.exists() + ", ist Verzeichnis: " + root.isDirectory());
			
			File[] contents = root.listFiles();
			for(File content : contents){
				System.out.println(content.getName() + ": " + content.getPath());
				if(content.isDirectory()){
					System.out.println(content.length() + ", " + content.canExecute());
				}
			}
		}

	}

}
