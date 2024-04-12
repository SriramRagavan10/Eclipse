package oops2InheriPoly;

public class Products {
	private String name;
	private int productId;
	public String findType(int productId) {
		if(productId>10) {
			return "Liquid";
		}
		else {
			return "Solid";
		}
	}
	public Products(String name, int productId) {
		this.name=name;
		this.productId=productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String toString() {
		return "Name: "+name+", "+"Product ID: "+productId;
	}

}
