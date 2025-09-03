package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 2, 5, 1, 6, 3, 7 };
		// Using HashSet
		
		Set<Integer> uniqueset = new HashSet<>(Arrays.asList(numbers));
		
		Integer[] uniquenumbers = uniqueset.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(uniquenumbers));
		
	}
}