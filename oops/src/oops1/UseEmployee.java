package oops1;
//Composition
public class UseEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		AadharCard a=new AadharCard();
		a.setAddress("Mumbia");
		a.setDob("16/04/1995");
		a.setFathersname("Akilan");
		a.setName("Rythan");
		a.setNo(119988223377l);
		e.setName("Rythan");
		e.setEmail("rytham995@gamil.com");
		e.setId(156);
		e.setAge(28);
		e.setAadhar(a);
		System.out.println(e.getName()+" "+e.getEmail());
		System.out.println(e.getEmail());
		System.out.println(e.getId());
		System.out.println(e.getAge());
		System.out.println(e.getAadhar().getNo());
		System.out.println(e.getAadhar().getName());
		System.out.println(e.getAadhar().getAddress());
		System.out.println(e.getAadhar().getFathersname());
		System.out.println(e.getAadhar().getDob());
	}
}