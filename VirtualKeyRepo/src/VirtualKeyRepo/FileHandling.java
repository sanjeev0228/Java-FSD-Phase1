package VirtualKeyRepo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileHandling implements SameVales{
	public static File[] filesObjList;
	public String[] createFileList() {
		File Folder = new File (PATH);
		filesObjList = Folder.listFiles();
		String filesName[]= new String[filesObjList.length];
		int a =0;
		for(File x : filesObjList ) {
			filesName[a]= x.getName();
			a++;
			
		}
		return filesName;
	}
	
	public void displayFiles() {
		for(String x : this.createFileList()) {
			System.out.println(x);
		}
	}
	
	public void createFile(String fileName) throws IOException{
		Files.createFile(Paths.get(PATH+"//"+fileName));
		
	}
	
	public boolean deleteFile(String fileName, String  flag)throws IOException{
		
		if (flag == "check")
			return
     Files.exists(Paths.get(PATH+"//"+fileName));	
		return
				Files.deleteIfExists(Paths.get(PATH+"//"+fileName));
	
					
	}
	
	public int SearchFile(String fileName) {
		return 
				Arrays.binarySearch(createFileList(), fileName);
	}

}
