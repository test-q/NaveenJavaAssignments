package javaAssignments;

public class MethodsAssignments {

	public static void main(String[] args) {
		
		MethodsAssignments obj = new MethodsAssignments();
		
//		1.Write a program to print the sum of two numbers entered by user by defining your own method.
		System.out.println("--------------1. To print the sum of two numbers entered by user.--------------------");
		int s = obj.sum(20, 30);
		System.out.println("Sum of Two Numbers: " +s);
		
//		2. Define a method that returns the product of two numbers entered by user.
		System.out.println("\n-------------2. Returns the product of two numbers entered by user.------------------");
		double p = obj.product(5.5, 2.4);
		System.out.println("Product of Two Numbers: " + p);
		
//		3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
		System.out.println("\n-------------3. Returns the circumference and area of circle.------------------");
		obj.circleAreaAndCircum(3);
		
//		4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
		System.out.println("\n---------------4.Print the maximum and the minimum number respectively among three numbers-----------");
		int maximumNum =  obj.maxNumber(150, 250, 350);
		System.out.println("Maximum Number: " + maximumNum);
		int minimumNum = obj.minNumber(60, 50, 10);
		System.out.println("Minimum Number: " + minimumNum);
		
//		5. Define a program to find out whether a given number is even or odd.
		System.out.println("\n----------5. To find out whether a given number is even or odd.----------------------");
		obj.evenOrOdd(20);
		
//		6. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
		System.out.println("\n--------------6.To find out if he/she is elligible to vote--------------------");
		boolean eligibility = obj.isEligibleToVote(19);
		System.out.println("Eligibility of person: " + eligibility);
		
//		7. Define a method to find out if number is prime or not.
		System.out.println("\n----------------7. Number is prime or not.--------------------");
		System.out.println(obj.isPrimeNum(199));
		
//		8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered
		System.out.println("\n---------------8. Enter Marks and display grades.-----------------------");
		String g = obj.displayGrades(95);
		System.out.println("Student Grade: " +g);
		
//		9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//		Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//		4! = 1*2*3*4 = 24
		
		System.out.println("\n------------------9. Factorial of a number-------------------");
		System.out.println(obj.factorial(4));
		//obj.factorial(4);
	

	}
	

	public int sum(int a, int b) {
		int c = a+b;
		return c;
		
	}
	

	public double product(double a, double b) {
		double d = a*b;
		return d;

	}
	

	public void circleAreaAndCircum(int radius) {
		
		double area = Math.PI * (radius * radius);
		System.out.println("Area of Circle: " +area);
		
		double circumference= 2 * Math.PI * radius;
		System.out.println("Circumference of Circle: " + circumference);
		
	}
	
	/**
	 * This method findout maxNumber out of 3 number given by user.
	 * @param a
	 * @param b
	 * @param c
	 * @return max
	 */
	public int maxNumber(int a, int b, int c) {
		int max = 0;
		if(a>=b && a>=c) {
			max = a;
		}else if(b>=a && b>=c) {
			max = b;
		}else if(c>=a && c>=b) {
			max = c;
		}else if(a==b && a==c && b==c) {
			max =a;
		}
		return max;
		
	}
	
	public int minNumber(int a, int b, int c) {
		int min = 0;
		if(a<=b && a<=c) {
			min = a;
		}else if(b<=a && b<=c) {
			min = b;
		}else if(c<=a && c<=b) {
			min = c;
		}else if(a==b && a==c && b==c) {
			min =a;
		}
		return min;
		
	}
	
	public void evenOrOdd(int n) {
		
		if(n % 2 == 0) {
			System.out.println(n+" is EVEN number");
		}else {
			System.out.println(n+" is ODD number");
		}
	}
	
	public boolean isEligibleToVote(int age) {
		boolean flag = true;
		if(age>=18) {
			return flag;
		}else {
			flag = false;
			return flag;
		}
	}
	
	public boolean isPrimeNum(int num) {
		//A prime number is a number which is divisible by only two numbers: 1 and itself.
		//So, if any number is divisible by any other number, it is not a prime number.
		//Hence use for or while loop - We only have to loop through 2 to half of Number.
		int temp;
		boolean flag = true;
		for(int i=2; i<=num/2; i++) {
			temp = num%i;
			if(temp == 0) {
				flag = false;
				System.out.println(num + " is not a Prime Number");
				break;
			}else {
				System.out.println(num + " is a Prime Number");
				break;
			}
		}	
		return flag;
		
	}
	
	public String displayGrades(int marks) {
		System.out.println("Users mark out of 100 is: " + marks);
		String grade ="NA";
		
		if(marks>=91 && marks<=100) {
			grade = "AA";
		}else if(marks>=81 && marks<=90) {
			grade = "AB";
		}else if(marks>=71 && marks<=80) {
			grade = "BB";
		}else if(marks>=61 && marks<=70) {
			grade = "BC";
		}else if(marks>=51 && marks<=60) {
			grade = "CD";
		}else if(marks>=41 && marks<=50) {
			grade = "DD";
		}else if(marks<=40) {
			grade = "FAIL";
		}
		return grade;
	}
//	1*2*3*....*(n-1)*n. E.g.-
//	4! = 1*2*3*4 = 24
//	3! = 3*2*1 = 6
//	2! = 2*1 = 2
//	Also,
//	1! = 1
//	0! = 1
	
	public int factorial(int num) {
		int factorial = 1;
		System.out.println("Factorial of num: " +num);
		for(int i=1; i<=num; i++) {
			factorial = factorial*i;
		}
		return factorial;
	}

}
