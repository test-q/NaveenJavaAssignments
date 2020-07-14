package encapsulationTest;

public class EncapT {

	public static void main(String[] args) {
		numberTest.Number num = new numberTest.Number();
		num.setAge(12);
		System.out.println(num.getAge());
		
		num.setPolicy("HR Policy");
		System.out.println(num.getPolicy());
		
		

	}

}
