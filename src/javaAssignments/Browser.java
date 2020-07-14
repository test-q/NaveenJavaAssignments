package javaAssignments;

import java.util.ArrayList;

public class Browser {
	/*
	    2. Design a browser class template with the following features:
		 variables:
		 browserName
		 vendorName
		 currentVersion
		 List of plugins supported by Browser in Array List<String>

		--Design the constructor of this class with different parameters and all parameters.

		--Write the get method of each variable with return keyword. 
 
 */
	
	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> pluginList;
	
	public Browser() {
		
	}
	
	public Browser(String browserName) {
		this.browserName = browserName;
		
	}
	
	public Browser(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
	}
	
	public Browser(String browserName, String vendorName, double currentVersion) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public Browser(String browserName, String vendorName, double currentVersion, ArrayList<String> pluginList) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.pluginList = pluginList;
	}
	
	public String getBrowserName() {
		return browserName;
	}
	
	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
	
	public String getVendorName() {
		return vendorName;
	}
	
	public double getCurrentVersion() {
		return currentVersion;
	}
	
	public ArrayList<String> getPluginList() {
		return pluginList;
	}
	


	public static void main(String[] args) {
		
		ArrayList<String> pluginList = new ArrayList<String> ();
		pluginList.add("SilverLight");
		pluginList.add("HTTPSEveryone");
		pluginList.add("LastPass");
		pluginList.add("Google Toolbar");
		
		Browser b1 = new Browser("Google Chrome");
		System.out.println(b1.browserName); // Direct field assignment
		b1.setBrowserName("FireFox"); //value set by setter()
		System.out.println(b1.getBrowserName()); //value get getter()
		System.out.println("-------------------");
		
		Browser b2 = new Browser("Google Chrome", "Sergey Brin");
		System.out.println(b2.browserName);
		System.out.println(b2.vendorName);
		System.out.println("-------------------");
		
		Browser b3 = new Browser("Google Chrome", "Sergey Brin", 8.30);
		System.out.println(b3.browserName);
		System.out.println(b3.vendorName);
		System.out.println(b3.currentVersion);
		System.out.println("-------------------");
		
		Browser b4 = new Browser("Google Chrome", "Sergey Brin", 8.30, pluginList);
		System.out.println(b4.browserName);
		System.out.println(b4.vendorName);
		System.out.println(b4.currentVersion);
		System.out.println(b4.pluginList);
		System.out.println(b4.pluginList.get(3));
		System.out.println("-------------------");
		
//		Browser obj = new Browser(); 
//		System.out.println(obj.getBrowserName());
		

	}

}
