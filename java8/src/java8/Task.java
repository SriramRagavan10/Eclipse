package java8;

public interface Task {
	public static String getName() {
		return "Rythan";
	}
	public default void getAge() {
		System.out.println(25);
	}
}
