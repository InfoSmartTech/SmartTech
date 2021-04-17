package CreateFile;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	
	public static void main(String[] args) {
		
		
		File folder = new File("C:/Users/Botir/Desktop/CreationOfFile");
		
		folder.mkdir();
		
		File file = new File("C:/Users/Botir/Desktop/CreationOfFile/CreateFile.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}
