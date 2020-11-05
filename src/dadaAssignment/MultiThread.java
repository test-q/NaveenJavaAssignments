package dadaAssignment;

import java.util.HashMap;
import java.util.Map;

public class MultiThread extends Thread{
	
	public static HashMap<Integer, Boolean> dataMap = new HashMap<Integer, Boolean>();

	String threadName;
	
	public MultiThread(String threadName) {
		this.threadName = threadName;
	}
	public void run() {
		
		for(Map.Entry<Integer, Boolean> s : dataMap.entrySet()) {
			synchronized(this) {
				if(s.getValue() == false) {
					try {
						s.setValue(true);
						Thread.sleep(500);
						System.out.println("Thread Name "+this.threadName + " :" + s.getKey());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
	}
	public static void main(String[] args) {
		
		for(int i=0; i<50; i++) {
			dataMap.put(i, false);
		}
		
		MultiThread thread1 = new MultiThread("Thread1");
		thread1.start();
		MultiThread thread2 = new MultiThread("Thread2");
		thread2.start();
		MultiThread thread3 = new MultiThread("Thread3");
		thread3.start();
		MultiThread thread4 = new MultiThread("Thread4");
		thread4.start();
		MultiThread thread5 = new MultiThread("Thread5");
		thread5.start();
		
	
	
	}

}
