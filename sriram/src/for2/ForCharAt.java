package for2;

public class ForCharAt {
	public static void main(String[]args) {
		String[] arr=new String[5];
		arr[0]="Sri";
		arr[1]="Ram";
		arr[2]="Balu";
		arr[3]="Babu";
		arr[4]="Aravid";
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].charAt(0));
		}
	}

}
