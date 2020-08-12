package shopInventory;

public class Products {
	private int productId;
	private String productName;
	private float price;
	private int unit;
	public String warranty;
	public String categoryName;
	
	public Products() {
		this.productId = 0;
		this.productName = " ";
		this.categoryName = " ";
		this.price = 0.0f;
		this.unit = 0;
		this.warranty = " ";
	}
	public Products(int productId, String productName, String categoryName, float price, int unit, String warranty) {
		this.productId = productId;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
		this.unit = unit;
		this.warranty = warranty;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductId() {
		return productId;
	}
	
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;
	}
	
	
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	
	
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getUnit() {
		return unit;
	}	
	
	public void showProductDetails() {
		System.out.println("Product ID: " + getProductId());
		System.out.println("Product Name: " + getProductName());
		System.out.println("Category Name: " + categoryName);
		System.out.println("Price: " + getPrice());
		System.out.println("Qty: " + getUnit());
		System.out.println("Warranty: " + warranty);
		System.out.println("");
	}

}
