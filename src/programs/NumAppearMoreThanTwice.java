package programs;

import java.util.HashMap;

public class NumAppearMoreThanTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,2,3,4,5,5,6,5,4,3,2,1,0};

		HashMap<Integer, Integer> frequency = new HashMap<>();
		
		for(int num : arr) {
			frequency.put(num, frequency.getOrDefault(num, 0) +1);
		}
		
		System.out.println("Elements that appears more than twice: ");
		for(int key : frequency.keySet()) {
			if(frequency.get(key) > 2) {
				System.out.println(key);
			}
		}
	}

}
