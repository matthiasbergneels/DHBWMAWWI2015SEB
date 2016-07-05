package algorithmen;

import java.io.File;

public class FilesystemRecursiv {

	public static void main(String[] args) {
		File dir = new File(System.getProperty("user.dir"));
		
		writeDirectoryList(dir, 0);

	}
	
	private static void writeDirectoryList(File file, int depth){
		String ident = "";
		for(int i = 0; i < depth; i++){
			ident += " ";
		}
		System.out.println(ident + "> " + file.getAbsolutePath());
		for(File f : file.listFiles()){
			if(f.isDirectory()){
				writeDirectoryList(f, ++depth);
			}
			if(f.isFile()){
				System.out.println(ident + "- " + f.getAbsolutePath());
			}
		}
	}

}
