package day2;

public class Test14 {
	public static void main(String[]args) {
		String name= "world wide wonder";
		String[] n=name.split(" ");
		int l1=n[0].length();
		int l2=n[1].length();
		int l3=n[2].length();
		String u=n[0].toUpperCase()+"\n"+n[1].toUpperCase()+"\n"+n[2].toUpperCase();
		String name2="programs";
		String n1=n[0].concat(name2);
		System.out.println(l1+" "+l2+" "+l3+"\n"+u+"\n"+n1);
		
	}

}
