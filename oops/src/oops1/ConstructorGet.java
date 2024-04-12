package oops1;

public class ConstructorGet {
	private String name;
	private int age;
	private String course;
	private float percentage;
	public ConstructorGet(String name, int age, String course, float percentage) { //Parameterized Constructor
		this.name=name;
		this.age=age;
		this.course=course;
		this.percentage=percentage;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public String getCourse() {
		return course;
	}

}
