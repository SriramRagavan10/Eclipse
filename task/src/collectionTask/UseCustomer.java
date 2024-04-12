package collectionTask;

import java.util.Arrays;
import java.util.List;

public class UseCustomer {
	public static void main(String[] args) {
		Customer cus1=new Customer("Kundhavai", 20, "Female", "Salt", 20, 1380);
		Customer cus2=new Customer("Vandhiyadevan", 24, "Male", "Furits", 450, 1050);
		Customer cus3=new Customer("Arunmozhi", 21 , "Male", "Vegetables", 800, 600);
		Customer cus4=new Customer("Karikalan", 25, "Male", "Shampoo", 388, 842);
		Customer cus5=new Customer("Nandhini", 30, "Female", "Juice", 690, 715);
		Customer cus6=new Customer("Raji", 16, "Female", "Chilli Powder", 10, 230);
		Customer cus7=new Customer("Sriram", 13, "Male", "Biscuit", 60, 50);
		List<Customer>customers=Arrays.asList(cus1, cus2, cus3, cus4, cus5, cus6, cus7);
		System.out.println(cus1.fistChar(customers));
		System.out.println("-");
		System.out.println(cus2.secondMaximum(customers));
		System.out.println("--");
		System.out.println(cus3.thirdDetails(customers));
		System.out.println("---");
		cus4.maleCustomer(customers);
		System.out.println("----");
		System.out.println(cus4.minimumLen(customers));
	}
}