package collectionTask;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
	private String name;
	private int id;
	private String gender;
	private String productName;
	private int productPrice;
	private int availableAmount;
	public Customer(String name, int id, String gender, String productName, int productPrice, int availableAmount) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.productName=productName;
		this.productPrice=productPrice;
		this.availableAmount=availableAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getAvailableAmount() {
		return availableAmount;
	}
	public void setAvailableAmount(int availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String toString() {
		return "Name=" + name + ", ID=" + id + ", Gender=" + gender + ", Product Name=" + productName
				+ ", Product Price=" + productPrice + ", Available Amount=" + availableAmount;
	}
	public List<Character> fistChar(List<Customer> a) {
		List<Character> b=a.stream().map(x->x.getName().charAt(0)).collect(Collectors.toList());
		System.out.println("First Character: ");
		return b;
	}
	public int secondMaximum(List<Customer> a) {
//		int max=a.get(0).getAvailableAmount();
//		int secMax=max;
//		for(int i=0; i<a.size();i++) {
//			if(a.get(i).getAvailableAmount()>max) {
//				secMax=max;
//				max=a.get(i).getAvailableAmount();
//			}
//			if(a.get(i).getAvailableAmount()>secMax && a.get(i).getAvailableAmount()!=max) {
//				secMax=a.get(i).getAvailableAmount();
//			}
//		}
		List<Customer> b=a.stream().sorted(Comparator.comparing(Customer::getAvailableAmount).reversed()).collect(Collectors.toList());
		System.out.println("Second Maximum Available Amount: ");
		return b.get(1).getAvailableAmount();
	}
	public Customer thirdDetails(List<Customer> a) {
		//List<Customer> b=new ArrayList<>();
//		int max=a.get(0).getAvailableAmount();
//		int secMax=max;
//		int third=secMax;
//		for(int i=0; i<a.size();i++) {
//			if(a.get(i).getAvailableAmount()>max) {
//				secMax=max;
//				max=a.get(i).getAvailableAmount();
//			}
//			if(a.get(i).getAvailableAmount()>secMax && a.get(i).getAvailableAmount()!=max) {
//				third=secMax;
//				secMax=a.get(i).getAvailableAmount();
//			}
//			if(a.get(i).getAvailableAmount()>third && a.get(i).getAvailableAmount()!=max && a.get(i).getAvailableAmount()!=secMax) {
//				third=a.get(i).getAvailableAmount();
//				b.add(a.get(i));
//			}
//		}
		List<Customer> b=a.stream().sorted(Comparator.comparing(Customer::getAvailableAmount).reversed()).collect(Collectors.toList());
		System.out.println("Third Maximum Available Amount Details: ");
		return b.get(2);
	}
	public void maleCustomer(List<Customer> a) {
		List<Customer> b=a.stream().filter(x->x.getGender().equals("Male")).collect(Collectors.toList());
		System.out.println("Male Customer: ");
		b.forEach(x->System.out.println(x.getName()+" - "+x.getProductName()+" - "+x.getProductPrice()));
	}
	public int minimumLen(List<Customer> a) {
		int min=a.get(0).getProductName().length();
		int m=a.get(0).getProductPrice();
		for(int i=0; i<a.size(); i++) {
			if(a.get(i).getProductName().length()<min) {
				min=a.get(i).getProductName().length();
				m=a.get(i).getProductPrice();
			}
		}
		System.out.println("Minimum Product Length: ");
		return m;
	}
}
