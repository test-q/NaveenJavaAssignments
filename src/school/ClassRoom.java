package school;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		boolean bContinue = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To School Menu...");
		while(bContinue == true) {
			System.out.println("-------------------------------------------");
			System.out.println("1. Add Student Info.");
			System.out.println("2. Show All Student Information");
			System.out.println("3. Search Student By Name");
			System.out.println("4. Edit Student Info By Name");
			System.out.println("5. Quit");
			System.out.print("Please select Option: ");
			int option = sc.nextInt();
			sc.nextLine();
			
			if(option == 1) {
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
				
			}
			else if(option == 2) {
				for(Student stu : studentList) {
					stu.showDetails();
					System.out.println("-------------------------------------------");
				}
			}
			else if(option == 3) {
				boolean flag = false;
				System.out.println("Enter Student Name to Search: ");
				String name = sc.nextLine();
				for(Student s : studentList) {
					if(s.getName().equalsIgnoreCase(name)) {
						s.showDetails();
						flag = true;
					}
				}
				if(flag == false) {
					System.out.println("Student Not Found.");
				}
			}
			else if(option == 4) {
				System.out.println("Enter Student Name to Edit: ");
				String name = sc.nextLine();
				for(Student s : studentList) {
					if(s.getName().equalsIgnoreCase(name)) {
						System.out.print("Enter New Address.");
						String newAdd = sc.nextLine();
						s.setAddress(newAdd);
					}	
				}
				System.out.println("Student Updated Successfully.");
			}
			else {
				System.out.println("-------------------------------------------");
				System.out.println("Thanks For Using School data.");
				bContinue = false;
			}
		
		}


	}

}
