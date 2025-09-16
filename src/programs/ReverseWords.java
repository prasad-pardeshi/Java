package programs;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello world from Java";
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			String reversedWord = new StringBuilder(word).reverse().toString();
			result.append(reversedWord).append(" ");
		}
		
		System.out.println(result.toString());
		
	}

}
