package dadaAssignment;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DeleteFile {

	public static void main(String[] args) {
	
		String folderName = "C:\\Users\\rupal\\OneDrive\\Desktop\\Test";
		String file1 = folderName + "\\One.txt";
		String file2 = folderName + "\\Two.txt";
		String file3 = folderName + "\\Three.txt";
		
		
		File folderObj = new File(folderName);
		try {
			//Creating folder if it does not exist.
			if(folderObj.mkdir()) {
				System.out.println("Folder created");
				File fileObj1 = new File(file1);
				fileObj1.createNewFile();
				File fileObj2 = new File(file2);
				fileObj2.createNewFile();
				File fileObj3 = new File(file3);
				fileObj3.createNewFile();
				System.out.println("Files Created");
				FileWriter fw = new FileWriter(fileObj2);
				fw.append("Hi All");
				fw.close();
				Scanner sc = new Scanner(fileObj2);
				while(sc.hasNextLine()){
					System.out.println(sc.nextLine());
				}
				sc.close();
				
			}else {
				//Deleting folder if exist.
				for(File ele : folderObj.listFiles()) {
					System.out.println(ele);
					ele.delete();
				}
				folderObj.delete();
				//System.out.println("Folder Not created OR Exist.");
			}

		}catch(Exception e) {
			System.out.println("Something went wrong: " +e);
		}
		
		
		
		

	}

}
