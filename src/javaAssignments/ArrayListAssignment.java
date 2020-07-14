package javaAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListAssignment {

	public static void main(String[] args) {
		
//		1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		System.out.println("\n--------------1. Create a new array list, add some colors--------------");
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Black");
		color.add("White");
		color.add("Pink");
		color.add("Gold");
		color.add("Silver");
		
//		for(String c : color) {
//			System.out.println(c);
//			
//		}

		System.out.println(color);
		
//		2. Write a Java program to insert an element into the array list at the first and last positions.
		System.out.println("\n--------------2. Insert an element into the array list at the first and last positions.--------------");
		color.add(0, "Orange");
		color.add(8, "Brown");
		System.out.println("'Orange' on 1st index and 'Brown' on last index ");
		System.out.println();
		
		System.out.println(color);
		
//		3. Write a Java program to retrieve an element (at a specified index) from a given array list.
	
		System.out.println("\n--------------3. Retrieve an element (at a specified index) from a given array list..--------------");	
		System.out.println("Retrive value at 5th index: " + color.get(5));
		
//		4. Write a Java program to update specific array element by given element.
		System.out.println("\n--------------4. Update specific array element by given element...--------------");	
		System.out.println("Updating 'Pink' to 'Yellow' color");
		color.set(5, "Yellow");   // to update set() method use
		
		System.out.println(color);
		
//		5. Write a Java program to remove the third element from a array list. 
		System.out.println("\n--------------5. Remove the third element from a array list.--------------");
		System.out.println("3rd Element is: " + color.get(2));
		color.remove(2);
		System.out.println("After remove the Third element from array");
		System.out.println(color);
		
//		6. Write a Java program to search an element in a array list.
		System.out.println("\n-------------- 6. To search an element in a array list--------------");
		System.out.println("Search for 'Gold' color in ArrayList");
		if(color.contains("Gold")== true) {
			System.out.println("Yes, Color Found");
		}else {
			System.out.println("No, Color Found");
		}
		
//		7. Write a Java program to reverse elements in a array list
		System.out.println("\n--------------7. To reverse elements in a array list--------------");
		System.out.println("ArrayList Before Reverse:  " + color);
		Collections.reverse(color);
		System.out.println("\nArrayList After Reverse a List: " + color);
		
		
//		8. Write a Java program to extract a portion of a array list.
		System.out.println("\n--------------8. To extract a portion of a array list.--------------");
		System.out.println("ArrayList Before Extract: " + color);
		System.out.println("I want to Extract 'Gold' to 'Black'");
		System.out.println("ArrayList After Extract: " + color.subList(2, 6));

		
//		9. Write a Java program of swap two elements in an array list.
		System.out.println("\n--------------9. Swap two elements in an array list.--------------");
		System.out.println("ArrayList Before Swap: " + color);
		System.out.println("Swap 'Yellow' with 'Red");
		Collections.swap(color, 3, 6);
		System.out.println("ArrayList Before Swap: " + color);
		
//		10. Write a Java program to empty an array list.
		System.out.println("\n--------------10. To empty an array list.--------------");
		color.clear();
		System.out.println("Is Array list is Empty:" +color.isEmpty());
		System.out.println("After Clearing ArrayList: " +color);
		
//		11. Write a Java program to trim the virtual capacity of an array list the current list size.
		System.out.println("--------------11. To trim the virtual capacity of an array list the current list size.--------------");
		color.add("Red");
		color.add("Blue");
		color.add("Black");
		color.add("White");
		color.add("Pink");
		color.add("Gold");
		color.add("Silver");
		System.out.println("ArrayList Before Trim: " + color);
		color.trimToSize();
		System.out.println("ArrayList After Trim: " + color);
		
//		12. Write a Java program to print all the elements of a ArrayList using the position of the elements
		System.out.println("\n--------------12. To print all the elements of a ArrayList using the position of the elements.--------------");
		for(int i=0; i<color.size(); i++) {
			System.out.println("Position of element " +i+ " : "  + color.get(i) );
		}
		
		
		
		
		
		
		
		
		
		

	}

}
