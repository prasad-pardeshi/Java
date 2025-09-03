package programs;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "PRASAD PARDESHI";
		
		StringBuilder sb = new StringBuilder(original);
		sb.reverse().toString();
		System.out.println(sb);
	}

}
