package dadaAssignment;

import java.util.ArrayList;

public class ReversePractise {

	public static void main(String[] args) {
		
		ArrayList<Float> listOld = new ArrayList<Float>();
		ArrayList<Float> listNew = new ArrayList<Float>();
		
		listOld.add(10.5f);
		listOld.add(20.5f);
		listOld.add(30.5f);
		listOld.add(40.5f);
		listOld.add(50.5f);
		
		System.out.println("Original List: " + listOld);
		int size = listOld.size();
		
		for(int i=0; i<size; i++) {
			listNew.add(0.0f);
		}
		
		//Reverse Logic
		for(int i=0, j=size-1; i<size; i++, j--) {
			float curValue = listOld.get(i);
			listNew.set(j, curValue);
		}
		System.out.println("After Reverse: " +listNew);
		
	}

}
