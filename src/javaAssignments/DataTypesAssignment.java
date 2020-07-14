package javaAssignments;

/**
 * 
 * @author rupal
 *
 */

public class DataTypesAssignment {

	public static void main(String[] args) {
		
//		1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//		Expected Output :
//		Hello 
//		Naveen K
		
		System.out.println("Hello");
		System.out.println("Rupali K");
		
//		2. Write a Java program to print the sum of two numbers. 
//		Test Data: 
//		74 + 36 
//		Expected Output :
//		110
		
		byte a = 74;
		byte b = 36;
		System.out.println(a+b);
		
//		3. Write a Java program to divide two numbers and print on the screen. 
//		Test Data : 
//		50/3
//		Expected Output :
//		16
		
		int a1 = 50;
		int b1 = 3;
		System.out.println(a1/b1);
		
//		4. Write a Java program to print the result of the following operations. Change your test data accordingly.
//		Test Data:
//		a. -5 + 8 * 6
//		b. (55+9) % 9 
//		c. 20 + -3*5 / 8 
//		d. 5 + 15 / 3 * 2 - 8 % 3 
//		Expected Output :
//		43 
//		1 
//		19 
//		13
		
		System.out.println(-5+8*6);
		System.out.println((55+9) % 9 );
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3 );
		
//		5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//		Test Data:
//		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//		Expected Output
//		2.138888888888889
		
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
//		6. Try to concat "Hello Selenium" with a character 't'.
		String st1 = "Hello Selenium";
		char c1 = 't';
		System.out.println(st1+c1);
		
//		7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//		"Your Toal amount is. 3700".
		
		int x = 100;
		int y = 200;
		int z = 3400;
		System.out.println("Your Toal amount is." +(x+y+z) +".");

//		8. What should be the output for :
		byte b3 = 065; 
		System.out.println(b3); //bcoz it is octal number 
		//0x8^2 (0) +  6x8^1 (48) +  5x8^0 (5)


	}

}
