package forTask;

public class ElementsAndCount {
	public static void main(String[] args) {
		String name="onesoft";
		String[] name1=name.split("");
		for(int i=0; i<name1.length; i++) {
			int count=1;
			for(int j=i+1; j<name1.length; j++) {
				if(name1[i].equals(name1[j])) {
					count++;
					name1[j]="@";
				}
			}
			if(count>=1 && name1[i]!="@") {
				System.out.print(name1[i]+"="+count+" ");
			}
		}
	}	
}
