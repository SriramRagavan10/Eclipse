package exception;

public class MultipleError {
	public static void main(String[] args) {
		String[] a= {null, "Java", "Language"};
		try {
		System.out.println(a[0].toUpperCase());
		System.out.println(a[1].charAt(5));
		System.out.println(a[3]);
		}
		catch(ArithmeticException ae) {
			System.out.println("Input Wrong");
		}
		catch(NumberFormatException nf) {
			nf.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException si) {
			System.out.println(si);
		}
		catch(NullPointerException np) {
			np.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Index Not Found");
		}
		catch(IndexOutOfBoundsException i) {
			System.out.println(i);
		}
		catch(RuntimeException re) {
			System.out.println("Check the Input "+re);;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Code Sucess");
		}
	}
}
