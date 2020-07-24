package dadaAssignment;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapString {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text: " );
		
		String text = sc.nextLine();
		int size = text.length();
		HashMap<Character, Integer> dataStore = new HashMap<Character, Integer>();
		
		for(int i=0; i<size; i++) {
			int value = 0;
			char key = text.charAt(i);
			boolean flag = dataStore.containsKey(key);
			
			if(flag == true) {
				value = dataStore.get(key);
			}
			
			dataStore.put(key, value+1);		
		}
		
		for(Character c : dataStore.keySet()) {
			System.out.println("Character: " +c + " Count: " +dataStore.get(c)) ;
		}
		
		//katake
		//k 1
	
	}

}
