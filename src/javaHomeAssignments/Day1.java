package javaHomeAssignments;

public class Day1 {

	public static void main(String[] args) {
		System.out.println("Hello Rupali !");
		System.out.println("----------------------");
		
		System.out.println("Hello World!");
		System.out.println("It's been nice knowing you.");
		System.out.println("Goodbye world!");
		System.out.println("----------------------");
		
		for(int j=0; j<4; j++){
		 for(int i=0; i<4; i++){
			System.out.print("*");
			System.out.print(" ");

		 }
			System.out.println("*");

		}
		System.out.println("----------------------");
		int n=4;
		for(int i=0; i<n; i++) {
			for(int j=n-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.println("* ");
			}
			System.out.println();
			
		}



	}

}
