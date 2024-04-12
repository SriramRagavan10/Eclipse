package Test;

public class Hyphen {
	public static void main(String[]args) {
		String a="SRIRAMA";
		if(a.length()%2==0) {
			System.out.println(a.substring(0,a.length()/2)+"-"+a.substring(a.length()/2));
		}
		else if(a.length()%2!=0) {
			System.out.println(a.substring(0,a.length()/2)+"-"+a.substring(a.length()/2,a.length()/2+1)+"-"+a.substring(a.length()/2+1));
	}
	}

}
