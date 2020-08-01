package dadaAssignment;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) {
		
		String fileName = "Test.txt";
		File obj = new File(fileName);
		
		
		try {
			if(obj.createNewFile()) {
				System.out.println("File Created Successfully");
			}
			else {
				System.out.println("File Already Exist.");
			}	
			System.out.println("************ File Info **************");
			System.out.println(obj.getName());
			System.out.println(obj.getAbsolutePath());
			System.out.println("File can Read: " + obj.canRead());
			System.out.println("File can write: " + obj.canWrite());
			System.out.println("File Path: " + obj.getPath());
			
			FileWriter fw = new FileWriter(obj, true);
			fw.write("Hi I am Rupali ....\n");
			fw.write("Hi I am Sharvi...\n");
			fw.write("Hi All\n");
			fw.close();
			
			Scanner sc = new Scanner(obj);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				
			}
			sc.close();
			
		}catch(Exception e) {
			System.out.println("Exception: " +e);
		}
	
		
		
		

	}

}
