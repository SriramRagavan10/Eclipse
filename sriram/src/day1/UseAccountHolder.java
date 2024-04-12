package day1;

public class UseAccountHolder {
	public static void main(String[]args) {
		AccountHolder a1=new AccountHolder();
		a1.name="Mano";
		a1.age=26;
		a1.gender="Male";
		a1.accountNumber=28330485612583l;
		a1.monthlyIncome=21000;
		a1.savingsPercentage=18;
		a1.savingsAmount=a1.monthlyIncome*a1.savingsPercentage/100;
		AccountHolder a2=new AccountHolder();
		a2.name="Savithri";
		a2.age=25;
		a2.gender="Female";
		a2.accountNumber=28330485612584l;
		a2.monthlyIncome=20000;
		a2.savingsPercentage=20;
		a2.savingsAmount=a2.monthlyIncome*a2.savingsPercentage/100;
		AccountHolder a3=new AccountHolder();
		a3.name="Kamban";
		a3.age=30;
		a3.gender="Male";
		a3.accountNumber=28330485612585l;
		a3.monthlyIncome=30000;
		a3.savingsPercentage=10;
		a3.savingsAmount=a3.monthlyIncome*a3.savingsPercentage/100;
		System.out.println(a1.savingsAmount+"\n"+a2.savingsAmount+"\n"+a3.savingsAmount);
	}

}
