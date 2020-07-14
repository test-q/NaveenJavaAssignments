package dadaAssignment;

public class TestInt {

	public static void main(String[] args) {
		
		IntegerConcept obj = new IntegerConcept();
		System.out.println("-------------MyAscending--------------");
		obj.myAscending(5);
		System.out.println("-------------MyDecending--------------");
		obj.myDescending(5);
		System.out.println("-------------MySummation--------------");
		System.out.println(obj.mySummation(5));
		System.out.println("-------------MyFactorial--------------");
		System.out.println(obj.myFactorial(5));
		System.out.println("-------------MyEven--------------");
		obj.myEven(30);
		System.out.println("\n\n-------------MyOdd--------------");
		obj.myOdd(30);
		System.out.println("\n--------------------Old Prime Number Program--------------------");
		obj.myPrimeOld(0);
		System.out.println(obj.isPrimeOld(0));
		System.out.println("\n--------------------Prime Number--------------------");
		obj.getPrime(100);
		System.out.println("\n--------------------DigitsCount--------------------");
		System.out.println(obj.myCountDigit(1234));
		System.out.println("\n--------------------Armstrong--------------------");
		obj.myArmstrong(456);
		System.out.println("\n--------------------Fibonacci Series--------------------");
		obj.myFibonacci(10);
		System.out.println("\n--------------------Palindrome OR Not--------------------");
		System.out.println(obj.isPalindrome("Aa"));
		obj.myPalindrome(14341);
		System.out.println("\n--------------------Palindrome Genral--------------------");
		obj.myPalindromeGenral("14341");
		obj.myPalindromeGenral("madam");
		System.out.println("\n--------------------Random Number--------------------");
		System.out.println(obj.myRandom());
		System.out.println("\n--------------------ASCII Value--------------------");
		System.out.println(obj.myAscii('0'));
		System.out.println("\n--------------------PalindromeNew OR Not--------------------");
		System.out.println(obj.isPalindromeNew("aamadamaa"));
		
		
		
		
		
	

	}

}
