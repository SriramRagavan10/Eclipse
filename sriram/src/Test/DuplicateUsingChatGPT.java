package Test;

import java.util.Arrays;

public class DuplicateUsingChatGPT {

	    public static void main(String[] args) {
	        String[] arrayWithDuplicates = {"apple", "banana", "apple", "orange", "banana", "apple"};

	        // Remove duplicates
	        String[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);

	        // Print array without duplicates
	        System.out.println("Array with duplicates: " + Arrays.toString(arrayWithDuplicates));
	        System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));
	    }

	    public static String[] removeDuplicates(String[] arrayWithDuplicates) {
	        int n = arrayWithDuplicates.length;
	        // Assuming all elements are unique initially
	        int newSize = n;
	        // Compare each element with all other elements
	        for (int i = 0; i < newSize; i++) {
	            for (int j = i + 1; j < newSize; j++) {
	                // If any two elements are equal
	                if (arrayWithDuplicates[i].equals(arrayWithDuplicates[j])) {
	                    // Replace duplicate element with last unique element
	                    arrayWithDuplicates[j] = arrayWithDuplicates[newSize - 1];
	                    newSize--;
	                    // Since we replaced the element, we need to recheck this index
	                    j--;
	                }
	            }
	        }
	        // Create a new array with unique elements
	        String[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, newSize);
	        return arrayWithoutDuplicates;
	    }
	}
