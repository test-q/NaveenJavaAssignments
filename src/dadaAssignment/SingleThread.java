package dadaAssignment;

public class SingleThread {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0; i<=100; i++) {
			Thread.sleep(500);
			System.out.println("Number: " + i);
		}

	}

}
