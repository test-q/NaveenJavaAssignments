package dadaAssignment;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {

		String fileName = "FamilyMembers.txt";
		File obj = new File(fileName);

		try {
			if (obj.createNewFile()) {
				System.out.println("File Created Sucessfully: " + fileName);
			} else {
				System.out.println("File Not created: " + fileName);
			}
			FileWriter fw = new FileWriter(obj, true);
			fw.write("Rupali\n");
			fw.write("Sharvi\n");
			fw.write("Mayur\n");
			fw.close();

			Scanner sc = new Scanner(obj);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("Somthing is wrong." + e);
		}

	}

}
