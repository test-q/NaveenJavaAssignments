package dadaAssignment;

import java.util.HashMap;
import java.util.Scanner;

public class CharCountHashMap {

	public static void main(String[] args) {
		HashMap<Character, Integer> dataMap = new HashMap<Character, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text: ");
		String input = sc.nextLine();
		String text = input.toUpperCase();
		int size = text.length();
		
		for(int i=0; i<size; i++) {
			int value = 0;
			char currChar = text.charAt(i);
			boolean flag = dataMap.containsKey(currChar);
			
			if(flag == true) {
				value = dataMap.get(currChar);	
			}		
			dataMap.put(currChar, value+1);
		}

		for(Character c : dataMap.keySet()) {
			System.out.println("Keys: " + c + " Values: " + dataMap.get(c));
		}
		sc.close();

	}

}
