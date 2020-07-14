package javaAssignments;

public class StringManipulationAssignment {

	public static void main(String[] args) {
		
		
		
//		1.  Write a program to check two different strings equality
		System.out.println("----------------------------");
		String str1 = "Hi Rupali welcome to selenium";
		String str2 = "Hi Sharvi welcome to selenium";
		
		System.out.println("Two different strings equality: " + str1.equals(str2));
		
		
//		2. Remove all  spaces in a String . 
//		  For example  : “         Hello      Everyone       “ .     
//		  Expected result: “HelloEveryone”.
		System.out.println("----------------------------");
		String str3 = "         Hello      Everyone       ";
		String updateStr3 = str3.trim();
		String expStr = updateStr3.replace("      ", "");
		System.out.println(expStr);
		
//		3. Write a program that will  print out last character and first character of a word.
		System.out.println("----------------------------");
		String str4 = "Selenium";
		int lenght = str4.length();
		System.out.println("My word is : " +str4);
		System.out.println("First Character of word: " + str4.charAt(0));
		System.out.println("Last Character of word: " + str4.charAt(lenght-1));
		
//		4. Write a program to verify a word or a character contains in the sentence.
		System.out.println("----------------------------");
		System.out.println("My sentence is: " + str2);
		System.out.println("Word contains: " +str2.contains("welcome"));
		System.out.println("Word not contains: " +str2.contains("aawelcome"));

//		5.Write a function/ method to reverse your own name.
		System.out.println("----------------------------");
		String name = "Rupali";
		System.out.println("My Name: " +name);
		int count = name.length()-1 ;
		for(int i=count; i>=0; i--) {
			
			char revChar = name.charAt(i);
			System.out.print(revChar);
			
		}
		
//		6. Write a program that gives you last half of the string.
		System.out.println("\n----------------------------");
		String str5 = "Welcome to Naveen Lab selenium batch June 2020";
		System.out.println("Full Sentence: " + str5);
//		System.out.println(str5.length());
		int startIndex = str5.indexOf("selenium");
//		System.out.println(startIndex);
		System.out.println("My half string: " + str5.substring(startIndex, str5.length()));
		
//		7.Write a program to get the 3rd  “ e “ of the string .
//		For example: “Welcome to Naveen Automation Lab ! “
		System.out.println("-----------3rd Occurrence of e-----------------");
		
		String str6 = "Welcome to Naveen Automation Lab !";
		
		System.out.println("1st e: " +str6.indexOf('e'));
		System.out.println("2nd e: " + str6.indexOf("e", str6.indexOf('e')+1));
		System.out.println("3rd e: " + str6.indexOf("e", str6.indexOf("e", str6.indexOf('e')+1)+1));
		System.out.println("4th e: " + str6.indexOf("e", str6.indexOf("e", str6.indexOf("e", str6.indexOf('e')+1)+1)+1));	
		
		
//		8. Write a method which gives index of (-1) if string is not available. . it should return integer. if String is present, 
//		then it should return the specific index.
		System.out.println("------------Gives index of (-1) if string is not available. . it should return integer. if String is present---------------");
		System.out.println(str6.indexOf("Rupali"));
		System.out.println(str6.indexOf("Naveen"));
		
//		9. Write a program that breaks a whole string into small strings, and print out its all values . (Hint: split, loop).
		System.out.println("-------------String Split---------------");
		String[] strSplit = str6.split(" ");
		for(int i=0 ; i < strSplit.length ; i++) {
			System.out.println(strSplit[i]);
		}
		
//		10. Assume that a string consists of 3 words, print out the middle one. 
		System.out.println("------------Take Middle word---------------");
		String str7 = "Very Good Morning";
		System.out.println("My string is: " +str7);
		int startIndex1 = str7.indexOf(" ")+1;
		int endIndex1 = str7.indexOf(" ", startIndex1);
		System.out.println("Middle word is: " + str7.substring(startIndex1, endIndex1));
	
//		11. get only numeric part from this String:
		String s = "your transaction id is: 12345 and reference id is 34567";
		System.out.println("----------Get Numeric Part In String-----------------");
		String tranId = s.substring(s.indexOf("is")+4, s.indexOf("5")+1);
		System.out.println(tranId);
		
		
		//s.indexOf("is", s.indexOf("is"));
		String refId = s.substring(s.indexOf("is", (s.indexOf("is"))+1)+3);
		System.out.println(refId);
		
	
//		   The difference between replace() and replaceAll() method 
		/* replace() method replaces all the occurrences of old char with new char 
		 * replaceAll() method replaces all the occurrences of old string with the new string.
		 * replaceFirst() method replaces the first occurrence of old string with the new string.
		 */
	       //replace():
		   String emp = "Rupali Katake Site is BeginnersBook.com Katake";
		   System.out.println("My string is: " + emp);
		   System.out.println("---------------------");
		   System.out.println(" ");
		   System.out.println("replace() a to s : " + emp.replace('a', 's'));
		   
		   //replaceFirst():
		   System.out.println("---------------------");
		   System.out.println("replaceFirst() Katake to Gurav : " +emp.replaceFirst("Katake", "Gurav"));
		   System.out.println("replaceFirst() from 'site' to entire string with 'XYZ.com' : " +emp.replaceFirst("Site(.*)", "XYZ.com")); //Replace string from "site" to end
		  
		   
		   
		   //replaceAll():
		   System.out.println("---------------------");
		   System.out.println("replaceAll() Katake to Gurav : " +  emp.replaceAll("Katake", "Gurav"));
		   System.out.println("replaceAll((.*)Site) TO 'welcome' : " + emp.replaceAll("(.*)Site", "Welcome"));
		   System.out.println("replaceAll(Site(.*)) TO 'welcome' : " + emp.replaceAll("Site(.*)", "Welcome"));
		   System.out.println("replaceAll((.*)Site(.*)) TO 'welcome' : " + emp.replaceAll("(.*)Site(.*)", "Welcome"));
		
		
		

	}

}
