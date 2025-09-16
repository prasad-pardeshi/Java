package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args) {
        String input = "Java is great and Java is powerful and Java is popular";

        // Convert to lowercase and split by space
     String[] words = input.toLowerCase().split("\\s");  

        // Use a HashMap to count word frequency
     	HashMap<String, Integer> wordCount = new HashMap<>();
     	
     	//remove other things apart from letters
     	for(String word : words) {
     		word = word.replaceAll("[^a-zA-Z]", "");
     		wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
     	}
     
     	
     	System.out.println("Duplicate words: ");
     	for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
     		if(entry.getValue() > 1) {
     			System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
     		}
     	}
     
     
    }
}