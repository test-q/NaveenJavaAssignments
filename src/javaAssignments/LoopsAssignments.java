package javaAssignments;

public class LoopsAssignments {

	public static void main(String[] args) {
		
//		1. WAP to print following output:
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman
		
		String s = "I am Batman";
		for(int i=0; i<5; i++) {
			System.out.println(s);
			System.out.println(" ");
		}
		
//		2. WAP to print following output:
//			I am Batman 1
//
//			I am Batman 2
//
//			I am Batman 3
//
//			I am Batman 4
//
//			I am Batman 5
//
//			I am Batman 6
//
//			I am Batman 7
//
//			I am Batman 8
//
//			I am Batman 9
		System.out.println("------------------------------------");
		for(int i=1; i<10; i++) {
			System.out.println(s+ " " + i);
			System.out.println(" ");
		}
		
//		3. WAP to print 10 to 1 using for, while and do-while loop
		System.out.println("------------------FOR LOOP---------------------");
		for(int i=10; i>0; i--) {
			
			System.out.println(i);
		}
		
		System.out.println("------------------WHILE LOOP-------------------");
		int i = 10;
		while(i>0) {
			
			System.out.println(i);
			i--;
		}
		
		System.out.println("-----------------DO WHILE LOOP------------------");
		int p = 10;
		do {
			
			System.out.println(p);
			p--;
			
		}while(p>0);
		
//		4. Write a program in Java to print "Hello World" ten times using while loop
		System.out.println("------------------------------------");
		int q = 1;
		while(q < 11) {
			System.out.println("Hello World");
			q++;
		}
		
//		5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		System.out.println("------------------------------------");
		int x = 1;
		while(x<11) {
			if(x % 7 == 0) {
				System.out.println("Multiple of 7 encountered. Quitting loop!");
				break;
			}else {
				System.out.println(x);
			}
			x++;
		}

	}

}
