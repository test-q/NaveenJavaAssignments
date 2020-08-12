package school;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClassRoom {

	public static void main(String[] args) {
		String fileName = "StudentsData.csv";
		File fStudent = new File(fileName);
		String header = "Name,Address,Roll Number,Marks,Gender";
		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
//			if (fStudent.createNewFile()) {
//				FileWriter fHeader = new FileWriter(fStudent);
//				//fHeader.write(header+"\n");
//				fHeader.close();
//			} else {
			if(!fStudent.exists()) {
				fStudent.createNewFile();
			}
			Scanner scfile = new Scanner(fStudent);
				while (scfile.hasNextLine()) {
					String value = scfile.nextLine();

					if (!header.equals(value)) {
						StringTokenizer token = new StringTokenizer(value, ",");
						int size = token.countTokens();
						if (size == 5) {
							String Name = token.nextToken();
							String Address = token.nextToken();
							String Rollnum = token.nextToken();
							int irollNum = Integer.parseInt(Rollnum);
							String marks = token.nextToken();
							float fMarks = Float.parseFloat(marks);
							String gender = token.nextToken();
							char cGender = gender.charAt(0);
							Student s = new Student(Name, Address, irollNum, fMarks, cGender);
							studentList.add(s);
						}
					}
					//System.out.println(value);
				}
				scfile.close();

//			}

			boolean bContinue = true;
			Scanner sc = new Scanner(System.in);

			System.out.println("Welcome To School Menu...");
			while (bContinue == true) {
				System.out.println("-------------------------------------------");
				System.out.println("1. Add Student Info.");
				System.out.println("2. Show All Student Information");
				System.out.println("3. Search Student By Name");
				System.out.println("4. Edit Student Info By Name");
				System.out.println("5. Quit");
				System.out.print("Please select Option: ");
				int option = sc.nextInt();
				sc.nextLine();

				if (option == 1) {
					System.out.print("Enter Student Info: ");
					System.out.println("");
					System.out.print("Enter Name: ");
					String sName = sc.nextLine();
					System.out.print("Enter Address: ");
					String sAddress = sc.nextLine();
					System.out.print("Enter RollNo: ");
					int sRollNo = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Marks: ");
					float sMarks = sc.nextFloat();
					sc.nextLine();
					System.out.print("Enter Gender: ");
					char sGender = sc.next().charAt(0);
					sc.nextLine();

					Student obj = new Student(sName, sAddress, sRollNo, sMarks, sGender);
					studentList.add(obj);
					System.out.println("Student Added Sucessfully.");

				} else if (option == 2) {
					for (Student stu : studentList) {
						System.out.println("-------------------------------------------");
						stu.showDetails();
					}
				} else if (option == 3) {
					boolean flag = false;
					System.out.println("Enter Student Name to Search: ");
					String name = sc.nextLine();
					for (Student s : studentList) {
						if (s.getName().equalsIgnoreCase(name)) {
							s.showDetails();
							flag = true;
						}
					}
					if (flag == false) {
						System.out.println("Student Not Found.");
					}
				} else if (option == 4) {
					System.out.println("Enter Student Name to Edit: ");
					String name = sc.nextLine();
					for (Student s : studentList) {
						if (s.getName().equalsIgnoreCase(name)) {
							int index = studentList.indexOf(s);
							System.out.print("Enter New Address.");
							String newAdd = sc.nextLine();
							s.setAddress(newAdd);
							studentList.set(index, s);
							
						}
					}
					System.out.println("Student Updated Successfully.");
				} else {
					System.out.println("-------------------------------------------");
					System.out.println("Thanks For Using School data.");

					FileWriter fwrite = new FileWriter(fStudent);

//					for (int i = 0; i < studentList.size(); i++) {
//						String temp = studentList.get(i).getName() + "," + studentList.get(i).getAddress() + ","
//								+ studentList.get(i).getRollNo() + "," + studentList.get(i).getMarks() + ","
//								+ studentList.get(i).getGender()+"\n";
//						fwrite.write(temp);
//					}

					fwrite.write(header+"\n");
					for (Student curStudent : studentList) {
						String temp = curStudent.getName() + "," + curStudent.getAddress() + ","
								+ curStudent.getRollNo() + "," + curStudent.getMarks() + "," + curStudent.getGender()
								+ "\n";

						fwrite.write(temp);
					}
					fwrite.close();
					bContinue = false;
				}

			}

		} catch (Exception e) {
			System.out.println("Something Went Wrong." + e);
		}
	}
}
