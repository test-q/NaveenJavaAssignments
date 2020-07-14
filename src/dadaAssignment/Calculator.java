package dadaAssignment;

import java.util.Scanner;

public class Calculator {
	
	private int value1, value2;
	int result;
	
	public static int test(int i) {
		System.out.println("Hi");
		return i;
	}
	
	public int getValue1() {
		return value1;
	}
	
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	
	public int getValue2() {
		return value2;
	}
	
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
	public int getResult(int operatopnid) {
       switch(operatopnid) {
		
		case 1 : 
			result = value1 + value2;
			System.out.println("Addition of " + value1 + " and " + value2 +" : " + result);
			break;
		case 2 :
			result = value1 - value2;
			System.out.println("Subtraction of " + value1 + " and " + value2 +" : " + result);
			break;
		case 3 :
			result = value1 * value2;
			System.out.println("Multiplication of " + value1 + " and " + value2 +" : " + result);
			break;
		
		case 4 :
			result = value1 / value2;
			System.out.println("Division of " + value1 + " and " + value2 +" : " + result);
			break;
		case 5 :
			result = value1 % value2;
			System.out.println("Modulus of " + value1 + " and " + value2 +" : " + result);
			break;
		default :
			System.out.println("Please Enter valid opration number");
		
		}
		
		return result;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		//Calculator c1 = new Calculator();
		//Calculator c2 = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first value: ");
		c.setValue1(sc.nextInt());
		
		System.out.print("Enter second value: ");
		//c1.setValue2(sc.nextInt());
		c.setValue2(sc.nextInt());
		
		System.out.println("Please select operation");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus");
		int operationId = sc.nextInt();
		
		c.getResult(operationId);
		Calculator.test(2);
		
		
			

	}

}
