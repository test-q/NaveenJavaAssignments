package numberTest;

public class Encaptest {

	public static void main(String[] args) {
		//Encapsulation Assignments
		Number n = new Number();
		n.setAge(30);
		System.out.println("Age: " + n.getAge());
		n.setPolicy("Test123Best123");
		System.out.println("Policy: " + n.getPolicy());
		System.out.println(n.name = "Rupali"); // Bcoz name is public variable
		n.setName("Sharvi"); // I using get and set method for public variable also
		System.out.println(n.getName());
		System.out.println("-----------------------------------");
		
		
		
//		Student info = Student.initStudent("Mayur", 10, 100);
//		System.out.println(info.getStdName() +"\n"+ info.getStdRollNo() +"\n"+ info.getStdId());
		
		Student s = new Student("Mayur Gurav", 15, 101);
		System.out.println("Name of Student: " + s.getStdName());
		System.out.println("RollNo of Student: " + s.getStdRollNo());
		System.out.println("ID of Student: " + s.getStdId());
		
		

	}

}
