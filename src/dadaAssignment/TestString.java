package dadaAssignment;

public class TestString {

	
	public static void main(String[] args) {
		
		StringConcept obj =  new StringConcept();
		String s = "Rupali Mahadeo Katake";
		System.out.println("Orignal String: " + s);
		System.out.println("Updated String: " + obj.myReplaceText(s));
		System.out.println("-------------------------------------");
		
		//obj.getChar(s);
		
		System.out.println("-------------------------------------");
		System.out.println(obj.myReplace("Hello World", 'o', '*'));

		System.out.println("-------------------------------------");
		System.out.println(obj.get2DuplicateChar("hellorrupalihello"));
		
		System.out.println("-------------------------------------");
		System.out.println(obj.get3DuplicateChar("hellorrrupaliiihello1111"));
		
		System.out.println("-------------------------------------");
		System.out.println(obj.getTwoCons("abcddefgghijjjklm"));
		
		System.out.println("------------------To uppercase------------------");
		System.out.println(obj.myUppercase("arupz"));
		
		System.out.println("-----------------To LowerCase-------------------");
		System.out.println(obj.myLowerCase("ASHARVIZ"));
		
		
	
		

		

		
		

	}

}
