package programs;

import java.util.HashMap;

public class CharacterOccurenceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Automation and test plan";
		str = str.toLowerCase();
		int count = 0;
		
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		
		System.out.println("The count of A is : " +count);
		
		

	}
}
