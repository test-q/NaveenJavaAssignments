package javaAssignments;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final float a1 = 1.2f ;
		System.out.println("Hello");
		
		String s = "My name is Rupali";
		System.out.println("My name is \"Rupali\"");
		System.out.println("My name is \'Rupali\'");
		System.out.println("My name is \\Rupali\\");
		System.out.println("My name is \n Rupali");
		System.out.println("My name is \t Rupali");
		
		
//		float fixedSalary = 12000f;
//		float HRA = 0.0f;
//		if (fixedSalary > 10000) {
//		                HRA = 5000;
//		} else {
//		                HRA = 2000;
//		}
//		float totalSalary = fixedSalary + HRA;
//		System.out.print("totalSalary " + totalSalary);

		 

//		float fixedSalary = 12000f;
//		float HRA = 0.0f;
//		HRA = (fixedSalary > 10000)?5000:2000;
//		float totalSalary = fixedSalary + HRA;
//		System.out.print("totalSalary " + totalSalary);
	
//		float fixedSalary = 21000f;
//		float HRA = 0.0f;
//		if(fixedSalary > 20000){
//            HRA = 8000;
//		} else if (fixedSalary < 20000  && fixedSalary > 10000) {
//		    HRA = 5000;
//		}else{
//	     HRA = 2000;
//		}
//
//		float totalSalary = fixedSalary + HRA;
//		System.out.print("totalSalary " + totalSalary);


		float fixedSalary = 8000f;
		float HRA = 0.0f; 
		HRA = (fixedSalary > 20000)?8000:( (fixedSalary < 20000  && fixedSalary > 10000)?5000:2000 );
		float totalSalary = fixedSalary + HRA;
		System.out.println("totalSalary " + totalSalary);
		
		int age = 65;
//		if(age>5) {
//			System.out.println("Go to school");
//		}else {
//			System.out.println("Enjoy at home");
//		}
		
		String value =(age>5)?"Go to school":((age==5)?"Go to playschool":"Enjoy Home");
		System.out.println(value);
		
		
		switch(age) {
		
		case 10:
			System.out.println("Age 10: " +age);
			break;
		case 20:
			System.out.println("Age 20: " +age);
			break;
		case 15:  
			System.out.println("Age 15: " +age);
			break;
		case 30:
			System.out.println("Age 30: " +age);
			break;
		default:
			System.out.println("Age Default: " +age);
			break;
		
		}
	
		String name = "PraMoD";
		
		switch(name.toUpperCase()) {
		
		case "RUPALI":
			System.out.println("Your name is R: " +name);
			break;
		case "TRUPTI":
			System.out.println("Your name is T " +name);
			break;
		case "PRAMOD" :  
			System.out.println("Your name is P " +name);
			break;
		case "SHARVI":
			System.out.println("Your name is S " +name);
			break;
		default:
			System.out.println(" Default: " +name);
			break;
		
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("I: " +i);
		}
		
		int i1=0;
		for(; i1<5;) {
			System.out.println("I1: " +i1);
			 i1++;
		}
		
		for(int i=10; i>=0 ; i--) {
			System.out.println("I: " +i);	
		}
		
		for(int i=10,j=0; i>=0 ; i--,j++) {
			System.out.println("I: " +i+ ", J:"+j);	
		}
		
		int j = 0;
		for(int i=10; i>=0 ; i--) {
			System.out.println("I: " +i+ ", J:"+j);
			j++;
		}
		
		for(int i=0; i<name.length(); i++) {
			System.out.println("Char at index "+ i+": " + name.charAt(i));
		}
		

		for (int i = 0; i < 10; i++) {
			  if (i == 5) {
			    continue;
			  }
			  System.out.println(i);
			}
		
		String fullName = "Rupali Mahadeo Katake # Test String";
		
		for(int i=0; i<fullName.length(); i++) {
			char curChar = fullName.charAt(i);
			if(curChar == ' ') {
				continue;
			}else if(curChar == '#') {
				break;
			}
			System.out.println(curChar);
		}
		
		String[] cars = {"Swift", "Honda", "Maruti", "Volvo", "BMW", "Audi"};
		int length = cars.length;
		
		System.out.println("Length: " +length);
		
		for(int i=0; i<cars.length; i++) {
			
			if(cars[i].equalsIgnoreCase("volvo")) {
				cars[i]="Hyundai";
			}
			System.out.println("Car at index "+i + " : "+cars[i]);
		}
		
		for(String c : cars) {
			System.out.println("Car: " + c);
		}
		
		// 2 dimensions Array
		//int [] num = {10,20,30};
		int[][] num = {{10,20,30,40}, {11,21,31,41}, {12,22,32,42}};
		
		for(int row=0; row<num.length; row++) {
			int[] currRow = num[row];
			for(int col=0; col<currRow.length; col++) {
				System.out.print(num[row][col]+" ");
				
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		
		for(int row=0; row<num.length; row++) {
			int[] currRow = num[row];
			for(int col=0; col<currRow.length; col++) {
				if(num[row][col]==31) {
					num[row][col]=91;
				}
				if(row==0 && col==3) {
					num[row][col]=16;
				}
				
				System.out.print(num[row][col]+" ");
				
			}
			
			System.out.println();
		}
		System.out.println("-------------------------");
		int day = 2;
		 if(day == 1){
		   System.out.println("Monday");	 
		 }else if(day == 2) {
			 System.out.println("Tuesday"); 
		 }
			  
		   switch(day){
		   
		   case 1: 
		   System.out.println("Monday");
		   break;
		   
		   case 2 : 
		   System.out.println("Tuseday");
		   break;
		   
		   case 3 : 
		   System.out.println("Wensday");
		   break;
		   
		   default:
		   System.out.println("Invalid");
		   break;
		   
		   }
		   
		   System.out.println("-------------------------");
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Your Name: ");
		   String n = sc.next();
		   System.out.println("Hi! Your Name is: " +n);
		  
		   System.out.println("-------------------------");
	
		   
		
		
		
		
	}


}


