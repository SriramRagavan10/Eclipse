package Test;

public class Pangram {
	    public static void main(String[] args) {
	        String sentence = "The quick brown fox jumps over the lazy dog";
	        if (isPangram(sentence.toLowerCase())) {
	            System.out.println("The sentence is a pangram.");
	        } else {
	            System.out.println("The sentence is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String sentence) {
	        boolean[] alphabetPresent = new boolean[26];
	        int index;

	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);
	            if ('a' <= ch && ch <= 'z') {
	                index = ch - 'a';
	                alphabetPresent[index] = true;
	            }
	        }

	        for (boolean value : alphabetPresent) {
	            if (!value) {
	                return false;
	            }
	        }

	        return true;
	    }


}
