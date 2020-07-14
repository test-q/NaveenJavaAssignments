package numberTest;

public class Student {
	
	private String stdName;
	private int stdRollNo;
	private int stdId;
	
//	private Student(String stdName, int stdRollNo, int stdId){    // I can create construtor as private but i have writen public static initStudent() and pass the
//		this.stdName = stdName;                                   // same parameter like construtor and create object of same class
//		this.stdRollNo = stdRollNo;
//		this.stdId = stdId;
//	}
	
	public Student(String stdName, int stdRollNo, int stdId){
		this.stdName = stdName;
		this.stdRollNo = stdRollNo;
		this.stdId = stdId;
	}
	
	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdRollNo() {
		return stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

//	public static Student initStudent(String stdName, int stdRollNo, int stdId) {
//		Student s = new Student(stdName, stdRollNo,stdId);
//		return s;
//	}

	

}
