package javaHomeAssignments;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		String[][] earth = {{"Red", "Yellow", "Pink"}, {"Apple", "Mango", "Orange"}, {"Rose", "Lotus", "Aster"}};
		
		for(int row=0; row<earth.length; row++) {
			for(int col=0; col<earth.length; col++) {
				System.out.print(earth[row][col]+ " ");		
			}
			System.out.println();
			
		}
		System.out.println("------------------------------");
		
		for(int row=0; row<earth.length; row++) {
			for(int col=0; col<earth.length; col++) {
				if(row==1 && col==2) { //I want to edit row1col2 data 
					earth[row][col] = "Banana"; //assign banana value at r0c2
				}
				if(earth[row][col]=="Yellow") {
					earth[row][col] = "Gold";
				}
				System.out.print(earth[row][col]+ " ");		
			}
			System.out.println();
			
		}
		System.out.println("------------------------------");
		
		for(int row=0; row<earth.length; row++) {
			for(int col=0; col<earth.length; col++) {
				if(row==1 && col==2) { //I want to edit row1col2 data 
					earth[row][col] = "Banana"; //assign banana value at r0c2
				}
				if(earth[row][col]=="Yellow") {
					earth[row][col] = "Gold";
				}
				System.out.print(earth[row][col]+ " ");		
			}
			System.out.println();
			
		}
		

	}

}
