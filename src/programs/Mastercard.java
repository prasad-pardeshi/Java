package programs;

public class Mastercard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "abc4e2";
		
		StringBuilder sb = new StringBuilder();
		
		for( char ch : s1.toCharArray()) {
			if (Character.isDigit(ch)) {
				int count = Character.getNumericValue(ch);
				sb.append("1".repeat(count));
			}
			else {
				sb.append(ch);
			}
		}
		
		System.out.println(sb);
	}
	}

