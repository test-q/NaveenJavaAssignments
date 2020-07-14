package javaAssignments;

public class ArraysAssignments {

	public static void main(String[] args) {
		
//		Question 1: Write a program to print the following pattern using for loop:
//
//			00 01 02 03 04 05 06 07 08 09 
//			10 11 12 13 14 15 16 17 18 19 
//			20 21 22 23 24 25 26 27 28 29 
//			30 31 32 33 34 35 36 37 38 39 
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(i);
				System.out.print(j);
			
				System.out.print(" ");
				
			}
			System.out.println("");
		}
		
//		Question 2: Write a program to create a static Array, having following cricket data:
//			--name, age, team name, DOB, gender, Strike Rate
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console
		
		System.out.println("---------------------------------------------------");
		String[] p1 = {"Player 1", "25", "India", "12-Jun-1982", "Male", "4.2"};
		String[] p2 = {"Player 2", "26", "India", "13-Jun-1983", "Female", "4.3"};
		String[] p3 = {"Player 3", "27", "India", "14-Jun-1984", "Male", "4.4"};
		String[] p4 = {"Player 4", "28", "India", "15-Jun-1985", "Female", "4.5"};
		String[] p5 = {"Player 5", "29", "India", "16-Jun-1986", "Male", "4.6"};
		
		Object[] playerInfo = {p1,p2,p3,p4,p5}; //It is array of arrays hence its called Object array
		
		for(int i=0; i<playerInfo.length; i++ ) {
			String[] p = (String[]) playerInfo[i]; // p1 data type is arrayOfString hence data type of p also arrayOfString
			for(int j=0; j<p.length; j++) {
				System.out.print(p[j] +", ");
			}
			System.out.println();
			
		}
		
//		Question 3: Try to print the following pattern on the console:
//			n = 4
//			n = 3
//			n = 2
//			n = 1
//			n = 0
		System.out.println("---------------------------------------------------");
		for(int i=4; i>=0; i--) {
			System.out.println("n = " + i);
		}
		

		
		

	}

}
