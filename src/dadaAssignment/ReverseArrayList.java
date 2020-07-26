package dadaAssignment;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		numList.add(50);
		System.out.print("Original List: " + numList);
		System.out.println("");
		
		int length = numList.size();
		System.out.println(length);
		
		for(int i=0 ,j=length-1; i<length/2; i++,j--) {
			int no1 = numList.get(i);
			int no2 = numList.get(j);
			
			numList.set(i, no2);
			numList.set(j, no1);	
		}	
		System.out.println(numList);	
	}

}
