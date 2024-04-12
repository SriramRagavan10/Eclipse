package day1;

public class Relation {
	public static void main(String[]args) {
		int x=500;
		int y=500;
		int z=800;
		boolean a=x>y;
		boolean b=y<z;
		boolean c=x>=z;
		boolean d=y<=x;
		boolean e=x==z;
		boolean f=z!=y;
		System.out.println(x+","+y+","+z+"\n"+a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);
	}

}
