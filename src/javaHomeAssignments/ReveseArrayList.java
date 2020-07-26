package javaHomeAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ReveseArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Iteam you want in List?");
		int size = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<size; i++) {
			System.out.print("Enter Iteam " + (i+1) +": ");
			int iteam = sc.nextInt();
			numList.add(i, iteam);
			sc.nextLine();
		}
		System.out.println("Origin List : " +numList);
		
		for(int i=0,j=size-1 ; i<size/2 ; i++,j--) {
			int value1 = numList.get(i);
			int value2 = numList.get(j);
			
			numList.set(i, value2);
			numList.set(j, value1);
		}
		System.out.println("Reverse List: " +numList);
		
		

	}

}
