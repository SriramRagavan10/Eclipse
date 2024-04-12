package day1;

public class Logic {
	public static void main(String[]args) {
		int p=10;
		int q=20;
		int r=10;
		int s=50;
		boolean t=(p==r)&&(q<s);
		boolean u=(p==q)&&(s>r);
		boolean v=(p!=s)&&(q<r);
		boolean w=(p<=q)&&(r>=s);
		boolean x=(p<q)||(r<=s);
		boolean y=(r>p)||(q<s);
		boolean z=(s==p)||(r<q);
		boolean z1=(p>r)||(q==s);
		System.out.println(t+"\n"+u+"\n"+v+"\n"+w+"\n"+x+"\n"+y+"\n"+z+"\n"+z1);
	}

}
