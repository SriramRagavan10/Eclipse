package oops3dataabstraction;

public class UseAuthor {
	public static void main(String[] args) {
		Author written=new Author();
		System.out.println("Novel Name: "+written.findType("SciFi")+"\n"+"Selling Copies: "+written.highSelling(10000)+"\n"+"Good Sentance: "+written.findGoodSentance("A World Without Music its A Beautiful Dream Without Eyes")+"\n"+"Male Lead: "+written.findMaleLead("Suban")+"\n"+"Female Lead: "+written.findFemaleLead("Magizhaal")+"\n"+written.findPages(200)+"\n"+"Parts: "+written.findParts(2)+"\n"+"Price: "+written.findPrice(300));
	}

}
