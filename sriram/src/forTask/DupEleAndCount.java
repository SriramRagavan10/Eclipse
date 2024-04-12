package forTask;

public class DupEleAndCount {
	public static void main(String[] args) {
		String name="onesoft";
		String[] name1=name.split("");
		for(Integer i=0; i<name1.length; i++) {
			Integer count=1;
			for(Integer j=i+1; j<name1.length; j++) {
				if(name1[i].equals(name1[j])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(name1[i]+"="+count);
			}
		}
	}

}
