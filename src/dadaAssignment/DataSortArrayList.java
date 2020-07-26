package dadaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DataSortArrayList {

	public static void main(String[] args) {
		ArrayList<String> dataList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No. of elements you want: ");
		int count = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<count; i++) {
			System.out.print("Enter Value: ");
			String input = sc.nextLine();
			dataList.add(i, input);	
		}
		
		Collections.sort(dataList);
		System.out.println("**************** Sort Data*****************");
		for(String ele : dataList) {	
			System.out.println(ele);
		}
		
		System.out.println("*************** Reverse Data*******************");
		Collections.reverse(dataList);
		dataList.stream().forEach(ele -> System.out.println(ele));
		sc.close();
	}
}
