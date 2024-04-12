package exception;

public class OddException extends Exception {
	public OddException() {
		super();
	}
	
	public static void main(String[] args) throws OddException {
		int[] nums= {355, 999, 200, 160};
		if(nums[0]%2==0) {
			System.out.println("It is Even");
		}
		else {
			throw new OddException();
		}
	}
}