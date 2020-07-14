package javaAssignments;

import java.util.ArrayList;

	public class University {
	/**
	 * This is Constructor Assignments	
	 * 1. Design a University class template with the following features:
		variables:
		name
		country
		stablishedDate
		List of course provided in Array List<String>
     -- Design the constructor of this class with different parameters and all parameters.

     --Write the get method of each variable with return keyword, which will return the respective class variable. For example:
		public getName(){
		    return name;
		}
	 */
		
	//class variables
	
	String name;
	String country;
	String stablishedDate;
	ArrayList<String> courseList;
	
	public University() {
		
	}
	
	public University(String name){
		this.name = name;
	}
	
	public University(String name, String stablishedDate){
		this.name = name;
		this.stablishedDate = stablishedDate;
		
	}
	
	public University(String name, String country, ArrayList<String> courseList){
		this.name = name;
		this.country = country;
		this.courseList = courseList;
		
	}
	
	
	public University(String name, String country, String stablishedDate, ArrayList<String> courseList){
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.courseList = courseList;
		
	}

	public String getName(){
	    return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getStablishedDate() {
		return stablishedDate;
	}
	
	public ArrayList<String> getCourseList() {
		return courseList;
	}

	public static void main(String[] args){
		
		ArrayList<String> courseList = new ArrayList<String>();
		courseList.add("Mathematics");
		courseList.add("Science");
		courseList.add("Physics");
		courseList.add("English");
		
		University u1 = new University("Mumbai University");
		System.out.println(u1.name);
		System.out.println("---------------------");
		
		University u2 = new University("US University", "1-June-1975");
		System.out.println(u2.name);
		System.out.println(u2.stablishedDate);
		System.out.println("---------------------");
		
		University u3 = new University("US University", "USA", courseList);
		System.out.println(u3.name);
		System.out.println(u3.country);
		System.out.println(u3.courseList);
		System.out.println(u3.courseList.get(2));
		System.out.println("---------------------");
		
		University u4 = new University("UK University", "UK", "10-Aug-1974", courseList);
		System.out.println(u4.name);
		System.out.println(u4.country);
		System.out.println(u4.stablishedDate);
		System.out.println(u4.courseList);
		System.out.println(u4.courseList.get(0));
		System.out.println("---------------------");
		
	
		
		
		
	
	
	}
	}