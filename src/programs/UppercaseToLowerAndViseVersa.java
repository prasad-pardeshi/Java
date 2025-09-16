package programs;

public class UppercaseToLowerAndViseVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "PrAsAd pArDeShI";
		
		StringBuilder sb = new StringBuilder();
		
		for(char ch : name.toCharArray()) {
			
			if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
			else if (Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
			}
			else {
				sb.append(ch);
			}
		
		}
		
		System.out.println(sb.toString());
	}

}
