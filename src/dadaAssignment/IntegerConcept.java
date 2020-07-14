package dadaAssignment;

public class IntegerConcept {
	
	
	//3=>1,2,3
	public void myAscending(int num) {
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}	
	}
	
	//3=>3,2,1
	public void myDescending(int num) {
		for(int i=num; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	//5=>1+2+3+4+5
	public int mySummation(int num) {
		int value = 0;
		for(int i=1; i<=num; i++) {
			value = value + i;
		}	
		System.out.println("Summation of Num: " +num);
		return value;
	}
	
	//5=>1*2*3*4*5
	public long myFactorial(int num) {
		long value = 1;
		for(int i=1; i<=num; i++) {
			value = value*i;
		}
		System.out.println("Factorial of num: " + num);
		return value;
	}
	
	//Even number - 10=> 2, 4, 6, 8, 10
	public void myEven(int num) {
		
		for(int i=0; i<=num; i++) {
			if(i % 2 == 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}
	
	public void myOdd(int num) {
		for(int i=0; i<=num; i++) {
			if(i%2 != 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}
	
	//Find out all prime number old
	public void myPrimeOld(int num){
		for(int i=2; i<=num; i++) {
			if(isPrimeOld(i)) {
				System.out.println("Prime Nos. : "+ i);
			}	
		}
	}
	
	//Number is prime or not
	public boolean isPrimeOld(int num) {
		boolean flag = true;
		for(int i=2; i<num-1 ; i++) {
			if(num%i == 0 ) {
				flag = false;
			}
		}
		if(num == 0) {
			flag = false;
		}
		return flag;
	}
	
	//prime or not
	public void isPrime(int num) {
		int temp = 0;
		for(int i=2; i<num-1; i++) {
			if(num % i == 0) {
				temp = temp + 1;
			}		
		}	
		if(temp==0) {
			System.out.println(num + " : is Prime");
		}else {
			System.out.println(num + " : is Not Prime");
		}	
	}
	
	//Find out all prime number old
	public void getPrime(int num) {
		int temp = 0;
		for(int i=2; i<=num; i++) {
			for(int j=2; j<=i-1; j++) {
				if(i%j == 0) {
					temp = temp + 1;
				}
			}
			if(temp==0) {
				System.out.println(i);
				
			}else {
				temp = 0;
			}
		}	
	}
	
	public int myCountDigit(int num) {
		int digit = 0;
		while(num != 0) {
			num = num /10 ;
			digit = digit + 1;
		}
		return digit;
	}
	
//	153 = (1*1*1)+(5*5*5)+(3*3*3)  
//			where:  
//			(1*1*1)=1  
//			(5*5*5)=125  
//			(3*3*3)=27  
//			So:  
//			1+125+27=153  
	
	public void myArmstrong(int num) {
		int value = 0, temp , quotient;
		temp = num;
		while(num>0) {
			quotient = num % 10;
			num = num / 10; 
			value = value + (quotient* quotient* quotient);		
		}
		if(temp == value) {
			System.out.println(temp + " is Armstrong");
		}else {
			System.out.println(temp + " is Not Armstrong");
		}
	}
	
	//Fibonacci series => 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc
	public void myFibonacci(int num) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println("Fibonacci series: ");
		System.out.print(n1 + " " + n2);
		
		for(int i=2; i<num; i++) {
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	//121,42524
	public void myPalindrome(int num) {
		int sum = 0;
		int temp, r;
		temp = num;
		while(num>0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num/10;
		}
		
		if(temp == sum) {
			System.out.println(temp + " is Palindrome");
		}else {
			System.out.println(temp + " is not Palindrome");
		}		
	}
	//lol, madam, 151, 454
	public void myPalindromeGenral(String input) {
		String original, reverse = "";
		original = input;
		int length = input.length();
		
		for(int i=length-1; i>=0; i--) {
			reverse	= reverse + input.charAt(i);
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println(original + " is Palindrome");
		}else {
			System.out.println(original + " is not Palindrome");
		}
	}
	
	//Random number between range 100 to 50
	public int myRandom() {
		int max = 150;
		int min = 100;
		int num = 0;
		
		num = (int) (Math.random()*(max-min+1)+min);
		
		return num;
		
	}
	
	//print ascii value
	public int myAscii(char input) {
		int value = 0;
		value = value + input;
		return value;
	}
	
	
	
	
	
	
	
	//Lol  is Palindrome or not
	public boolean isPalindrome(String input) {
		boolean value = false;
		String orignal, reverse = "";
		orignal = input;
		int length = input.length();
		System.out.println(input + " is Palindrome or not");
		for(int i=length-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);
		}
		if(orignal.equalsIgnoreCase(reverse)) {
			value = true;
		}
		return value;
	}
	
	public boolean isPalindromeNew(String input) {
		System.out.println(input);
		boolean flag = true;
		int length = input.length();
		for(int i=0, j=length-1; i<length; i++,j--) {
			//System.out.println(i+ " " +j);
			char iChar = input.charAt(i);
			char jChar = input.charAt(j);
			System.out.println(iChar + " "+jChar);
			if(iChar != jChar) {
				flag = false;
				break;
			}
			
		}
		return flag;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
