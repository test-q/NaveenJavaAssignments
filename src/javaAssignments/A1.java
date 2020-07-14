 package javaAssignments;

public class A1 {

	void display() {
		System.out.println("Keyword------Default");
	}
	public static void main(String[] args) {
		//Default keyword
		A1 obj = new A1();
		obj.display();
		
		int a = 10;
		double b = a;
		System.out.println("a: "+ a);
		System.out.println("b: " + b); 
		
		double a1 = 10.50;
		int b1 = (int) a1;
		System.out.println("a1: "+ a1);
		System.out.println("b1: " + b1);
		
		int c = --a;
		System.out.println("c: " +c);
		System.out.println("a: " + a);
		
		int d=90;
		d  = 8;
		System.out.println("d: " +d);
		
		int x = 10;
		double y = 10.0;
		
		
		System.out.println(x==y);
		
		String name = "Rupali";
		String surname = "Katake";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf(' '));
		System.out.println(name + " " +surname);
		System.out.println(name.concat(" ").concat(surname));
		String fullName = "My \'name\' is \"Rupali\"";
		System.out.println(fullName);
		String path = "D:\\Rupali\\JAVA";
		System.out.println(path);
		System.out.println(name+"\n"+surname);
		System.out.println(name+"\t"+surname);
		
		String m ="10";
		int n = 20;
		String o = n+m;
		System.out.println("o: " +o);
		
		int p1= 10, p2=20;
		System.out.println(Math.max(p2, p1));
		System.out.println(Math.random()*201);
		
				
	
		
		
	}

}
