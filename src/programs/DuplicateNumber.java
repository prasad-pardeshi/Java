package programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2, 4};

		        Map<Integer, Integer> countMap = new HashMap<>();

		        // Count frequency of each number
		        for (int num : numbers) {
		            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		        }

		        System.out.println("Duplicate numbers:");
		        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
		            }
		        }
		    }
		}
	


