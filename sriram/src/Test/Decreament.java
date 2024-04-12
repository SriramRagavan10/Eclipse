package Test;

public class Decreament {
	public static void main(String[] args) {
		String[] a= {"x++", "x++", "x++"};
		int x=0;
        for(int i=0; i<a.length; i++) {
            if(a[i].equals("--x")) {
            	--x;
            }
            else if(a[i].equals("x++")) {
            	x++;
            }
            else if(a[i].equals("++x")) {
            	++x;
            }
            else {
            	x--;
            }
        }
		System.out.println(x);
	}

}
