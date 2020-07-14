package dadaAssignment;

public class TestMath {

	public static void main(String[] args) {
		
		MyMath m = new MyMath();
		System.out.println(m.mySum(5, 5));
		System.out.println(m.mySum(1.5f, 1.5f));
		System.out.println(m.mySum(12345, 12345));
		System.out.println(m.mySum(5.234, 4.15236));
		System.out.println(m.mySum("rupali", "katake"));
		System.out.println(m.mySum('a', 'b'));
		

	}

}
