

package dadaAssignment;

public class StringConcept {
	
	
	public String myReplaceText(String name) {
		
		String repString = name.replace("Rupali", "Pramod");
		return repString;
		
	}
	
	public void getChar(String name) {
		int k=0, j=0;
		String newName = name.replaceAll(" ", "");
		System.out.println("-------------FOR LOOP-----------");
		for(int i=0; i<newName.length(); i++) {
			System.out.println(newName.charAt(i));
		}
		
		//While loop
		System.out.println("-------------WHILE LOOP-----------");
		while(k<newName.length()) {
			System.out.println(newName.charAt(k));
			k++;
		}
		
		//DO-WHILE LOOP
		System.out.println("-----------------DO-WHILE LOOP----------------");
		do{
			System.out.println(newName.charAt(j));
			j++;
		}while(j<newName.length());
		
	}
	
	public String myReplace(String input, char source, char dest) {
		String value = "";
			
		for(int i=0; i<input.length(); i++) {
			char currentChar = input.charAt(i);
			
			if(currentChar == source) {
				currentChar = dest;	
			}
			value = value + currentChar;
		}
		return value;
	}
	
	//hello
	public String get2DuplicateChar(String input) {
		String value = "";
		
		for(int i=0; i<input.length()-1; i++) {
		
			char currentChar = input.charAt(i);
			char nextChar = input.charAt(i+1);
			if(currentChar == nextChar) {
			   value = value + currentChar;
			}
		}
		return value;
	}
	
	//rupppali
	public String get3DuplicateChar(String input) {
		String value = "";
		for(int i=0; i<input.length()-2; i++) {
			char currentChar = input.charAt(i);
			char secChar = input.charAt(i+1);
			char thirdChar = input.charAt(i+2);
			
			if(currentChar == secChar && currentChar == thirdChar) {
				value = value + currentChar;
			}	
		}	
		return value;
	}

	public String getTwoCons(String input) {
		System.out.println(input);
		String value = "";
		char preChar = '-';
		for(int i=0; i<input.length()-2; i++) {
			
			if(i>0) {
				preChar = input.charAt(i-1);
			}

			char currentChar = input.charAt(i);
			char secChar = input.charAt(i+1);
			char thirdChar = input.charAt(i+2);
			
			if(currentChar == secChar && currentChar != thirdChar && currentChar != preChar) {
				value = value + currentChar;
			}		
		}
		return value;
	}
	
	public String myUppercase(String input) {
		String value = "";
		for(int i=0; i<input.length(); i++) {
			char currentChar = input.charAt(i);
			if(currentChar >='a' && currentChar <='z') {
				currentChar = (char) (currentChar - 32);
				value = value + currentChar;
			}
		}
		return value;
	}
	
	public String myLowerCase(String input) {
		String value = "";
		for(int i=0; i<input.length(); i++) {
			char currentChar = input.charAt(i);
			if(currentChar >= 'A' && currentChar <= 'Z' ) {
				currentChar = (char) (currentChar + 32);
				value = value + currentChar;
			}
		}	
		return value;
	}
	
	
}