package dadaAssignment;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String data = "Rupali,Sharvi,Mayur";
		String header = "Name,Address,Roll Number,Marks,Gender\n";
		//System.out.println(data);
		
		StringTokenizer token = new java.util.StringTokenizer(header, ",");
		while(token.hasMoreTokens()) {
			String cuValue = token.nextToken();
			System.out.println(cuValue);
		}
		

	}

}
