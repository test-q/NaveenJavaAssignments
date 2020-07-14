package javaAssignments;

public class ConditionalOperatorsAssignment {

	public static void main(String[] args) {
		
//		1. Take three numbers from the user and print the greatest number. 
//
//		Test Data
//		Input the 1st number: 25 
//		Input the 2nd number: 78 
//		Input the 3rd number: 87
//		Expected Output :
//		The greatest: 87
		
		int x = 25;
		int y = 78;
		int z = 187;
		
		if(x>y && x>z) {
			
			System.out.println("The greatest: " + x);
			
		}else if(y>z) {
			
			System.out.println("The greatest: " + y);
			
		}else {
			
			System.out.println("The greatest: " + z);
		}
		
//		2. Write a Java program to test a number is positive or negative.
//
//		Test Data
//		Input number: 35 -- positive number
//		Input number: -11 -- negative number
		
		int a = 35;
		int b = -11;
		int num = 0;
		
		if(a>num) {
			
			System.out.println("Positive Number");
			
		}else if(b<num) {
			
			System.out.println("Negative Number");
			
		}else {
			
			System.out.println("Neither positive nor negative");
			
		}
				


	}

}
