package school;

import java.util.ArrayList;

public class Student {

	private String name;
	private String address;
	private int rollNo;
	private float marks;
	private char gender;
	
	public Student() {
		this.name = " ";
		this.address = " ";
		this.rollNo = 0;
		this.marks = 0.0f;
		this.gender = ' ';
	}
	
	public Student(String name, String address, int rollNo, float marks, char gender) {
		this.name = name;
		this.address = address;
		this.rollNo = rollNo;
		this.marks = marks;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void showDetails() {
		System.out.println("Name: " + getName());
		System.out.println("Address: " + getAddress());
		System.out.println("RollNo: " + getRollNo());
		System.out.println("Marks: " + getMarks());
		System.out.println("Gender: " + getGender());
	}
}
