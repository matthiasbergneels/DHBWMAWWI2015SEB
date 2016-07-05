package algorithmen;

import java.io.File;
import java.util.Iterator;
import java.util.Vector;

public class OutputFilesystem {

	public static void main(String[] args) {
		Vector<File> files = new Vector();
		
		File dir = new File(System.getProperty("user.dir"));
		files.add(dir);
		
		
		
		for(File n : files){
			System.out.println(n.getAbsolutePath());
			if(n.isDirectory()){
				for(File f : n.listFiles()){
					files.add(f);
				}
			}
		}
		

	}

}
