package forTask;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] alphabet = new boolean[26];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
            if (count == 26) {
                System.out.println("The string is a pangram.");
            }
        }
        System.out.println("The string is not a pangram.");
        System.out.println(alphabet[25]);
	    }
}
