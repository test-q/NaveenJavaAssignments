package dadaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapElementArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		
		System.out.println("Original Number List: " + numberList);
		//Collections.swap(numberList, 1, 3);  //Swap two number by using swap(listName, index1, index2)
		
		System.out.println("Which two number you want to swap");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int no1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter 2nd Number: ");
		int no2 = sc.nextInt();
		sc.nextLine();
		sc.close();
			
		boolean flag1 = numberList.contains(no1);
		boolean flag2 = numberList.contains(no2);
		
		if(flag1 == true && flag2 == true) {
			int index1 = numberList.indexOf(no1);
			int index2 = numberList.indexOf(no2);
			
			numberList.set(index1, no2);
			numberList.set(index2, no1);
			System.out.println("Number List After Swap: " + numberList);
		}
		else {
			System.out.println("Please Enter Correct Number.");
		}
		
	}

}
