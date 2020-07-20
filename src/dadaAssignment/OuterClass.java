package dadaAssignment;

public class OuterClass {
	int x = 10;
	public class InnerClass{
		int y = 5;
	}

	public static void main(String[] args) {
		//Java inner classes
		
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		
		System.out.println(myOuter.x);
		System.out.println(myInner.y);
		System.out.println(myOuter.x + myInner.y);
	
	

	}

}
