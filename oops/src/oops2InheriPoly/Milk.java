package oops2InheriPoly;

public class Milk extends Products {
	private String brand;
	private int price;
	public String findLitre(int price) {
		if(price==35) {
			return "Half Litre";
		}
		else if(price==56) {
			return "One Litre";
		}
		else {
			return "No Milk";
		}
		
	}
	public Milk(String name, int productId, String brand, int price) {
		super(name, productId);
		this.brand=brand;
		this.price=price;
	}
	public String toString() {
		return super.toString()+", "+"Brand: "+brand+", "+"Price: "+price;
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

}
