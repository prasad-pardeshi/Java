package programs;

public class VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Automation World";
		str = str.toLowerCase();
		
		int vowels= 0,  consonants = 0;
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		
		System.out.println("Vowels "+ vowels + " and" + " Consonants " +consonants);
		
	}

}
