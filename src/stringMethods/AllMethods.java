package stringMethods;

public class AllMethods {

	public static void main(String[] args) {

		// charAt() method - to return the character at specified index
		//syntax - public char charAt(it index)
		
		String str = "Hello";
		char result = str.charAt(4);
		System.out.println("charAt() Method result is : " +result);
		
		//compareTo method to compare two strings
		
		String s1 = "Prasad";
		String s2 = "Prasad";
		
		System.out.println("compareTo() Method result is : " +s1.compareTo(s2));
		
		

	}

}
