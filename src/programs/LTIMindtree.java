 package programs;

import java.util.Arrays;

public class LTIMindtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits = {"Apple", "Banana", "grapes", "Orange"};
		
		for (int i=0; i<fruits.length; i++) {
			if(fruits[i].equalsIgnoreCase("apple")) {
				fruits[i] = "Prasad";
			}
		}
		
		System.out.println(Arrays.toString(fruits));
		
		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		
		
		
		
		 
		
	}

}
