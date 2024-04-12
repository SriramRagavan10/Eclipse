package oops3dataabstraction;

public class Author implements DreamOfALoser,ImaginationLove {
	public String findType(String genre) {
		if(genre.equals("Feel Good")) {
			return "Dream of a Loser";
		}
		else if(genre.equals("Romantic")) {
			return "Imagination Love";
		}
		else if(genre.equals("SicFi")) {
			return "Journey for Love";
		}
		else {
			return "No Novel";
		}
	}
	public String highSelling(int count) {
		return "Dream of a Loser "+count;
	}
	public String findGoodSentance(String good) {
		return good;
	}
	public String findMaleLead(String name) {
		return name;
	}
	public String findFemaleLead(String name) {
		return name;
	}
	public String findPages(int page) {
		return "Pages: "+page;
	}
	public int findParts(int part) {
		return part;
	}
	public int findPrice(int price) {
		return price;
	}

}
