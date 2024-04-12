package oops2InheriPoly;

public class Salt extends Products {
	private String brand;
	private int price;
	public String findKiloGram(int price) {
		if(price==10) {
			return "Half Kilogram";
		}
		else if(price==23) {
			return "One Kilogram";
		}
		else {
			return "No Salt";
		}
	}
	public Salt(String name, int productId, String brand, int price) {
		super(name, productId);
		this.brand=brand;
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return super.toString()+", "+"Brand: "+brand+", "+"Price: "+price;
	}

}
