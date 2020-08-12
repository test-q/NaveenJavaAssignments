package shopInventory;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Inventory {

	//Rupali
	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<Products> productList = new ArrayList<Products>();
		String fileName = "ProductData.csv";
		File fProduct = new File(fileName);
		String header = "ProductID,ProductName,CategoryName,Price,Unit,Warranty";
		try {
			if(! fProduct.exists()) {
				fProduct.createNewFile();
			}
			Scanner scFile = new Scanner(fProduct);
			while (scFile.hasNextLine()) {
				String value = scFile.nextLine();
				if (!header.equals(value)) {
					StringTokenizer token = new StringTokenizer(value, ",");
					int size = token.countTokens();
					if (size == 6) {
						String id = token.nextToken();
						int iid = Integer.parseInt(id);
						String pName = token.nextToken();
						String cName = token.nextToken();
						String price = token.nextToken();
						float fPrice = Float.parseFloat(price);
						String unit = token.nextToken();
						int iUnit = Integer.parseInt(unit);
						String warranty = token.nextToken();

						Products p = new Products(iid, pName, cName, fPrice, iUnit, warranty);
						productList.add(p);
					}
				}
			}
			scFile.close();

			Scanner sc = new Scanner(System.in);
			System.out.println("***************** WelCome To Katake's Shop *****************\n");
			while (flag == true) {
				System.out.println("**********************************");
				System.out.println("Please Select Your Option.");
				System.out.println("1. Add New Product");
				System.out.println("2. Show All Product");
				System.out.println("3. Search Product By Name");
				System.out.println("4. Search Product By Category Name");
				System.out.println("5. Update Product Qty By Product ID");
				System.out.println("6. Quit");
				int choice = sc.nextInt();
				sc.nextLine();

				if (choice == 1) {
					System.out.println("***************** Enter Product Information *****************\n");
					System.out.print("Enter Product ID : ");
					int proId = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Product Name : ");
					String proName = sc.nextLine();
					System.out.print("Enter Product Category Name : ");
					String catName = sc.nextLine();
					System.out.print("Enter Product Price : ");
					float proPrice = sc.nextFloat();
					sc.nextLine();
					System.out.print("Enter Product Quntity/Unit : ");
					int proUnit = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Product Warranty : ");
					String proWarranty = sc.nextLine();
					System.out.println("");

					Products proObj = new Products(proId, proName, catName, proPrice, proUnit, proWarranty);
					productList.add(proObj);

				} else if (choice == 2) {
					for (Products p : productList) {
						System.out.println("**********************************");
						System.out.println("Product ID: " + p.getProductId());
						System.out.println("Product Name: " + p.getProductName());
						System.out.println("Category Name: " + p.categoryName);
						System.out.println("Price: " + p.getPrice());
						System.out.println("Qty: " + p.getUnit());
						System.out.println("Warranty: " + p.warranty);
						System.out.println("");
					}
				} else if (choice == 3) {
					System.out.print("Enter Product Name: ");
					String name = sc.nextLine();
					boolean found = false;
					System.out.println("**********************************");
					for (Products p : productList) {
						String proName = p.getProductName();
						if (proName.equalsIgnoreCase(name)) {
							p.showProductDetails();
							found = true;
							break;
						}
					}
					if (found == false) {
						System.out.println("Product Not Available.\n");
					}

				} else if (choice == 4) {
					System.out.println("Enter Product Category: ");
					String name = sc.nextLine();
					boolean cFound = false;
					System.out.println("**********************************");
					
					for (Products p : productList) {
						String proCat = p.categoryName;
						if (proCat.equalsIgnoreCase(name)) {
							p.showProductDetails();
							cFound = true;
							// break;
						}
					}
					if (cFound == false) {
						System.out.println("Category Not Available.\n");
					}
				} else if (choice == 5) {
					System.out.println("Enter Product Id: ");
					int id = sc.nextInt();
					sc.nextLine();
					boolean iFound = false;
					for (Products p : productList) {
						int proId = p.getProductId();
						if (proId == id) {
							int index=productList.indexOf(p);
							int preQty = p.getUnit();
							System.out.println("Old Qty : " + preQty);
							System.out.println("Enter Updated Qty: ");
							int curQty = sc.nextInt();
							p.setUnit(curQty);
							productList.set(index, p);
							iFound = true;
							break;
						}
					}
					System.out.println("Product Qty Updated Sucessfully.");
					if (iFound == false) {
						System.out.println("Invalid Product ID.\n");
					}

				} else if (choice == 6) {
					System.out.println("Thanks For Using Shop Inventory.");
					FileWriter fwrite = new FileWriter(fProduct);
					fwrite.write(header + "\n");

					for (Products p : productList) {
						String proData = p.getProductId() + "," + p.getProductName() + "," + p.categoryName + ","
								+ p.getPrice() + "," + p.getUnit() + "," + p.warranty + "\n";
						fwrite.write(proData);
					}
					fwrite.close();
					flag = false;
				}

			}

		} catch (Exception e) {
			System.out.println("Something Went Wrong: " + e);
		}
	}
}
