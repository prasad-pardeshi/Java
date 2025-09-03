package programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "PRASAD";
		
		StringBuilder sb = new StringBuilder(original);
		sb.reverse().toString();
		System.out.println(sb);
	}

}
