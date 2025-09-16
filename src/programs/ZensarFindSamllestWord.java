package programs;

public class ZensarFindSamllestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentance = "This Is Prasad";
		String[] words = sentance.split(" ");
		
		String smallest = words[0];
		
		for(String word: words) {
			if(word.length() < smallest.length()) {
				smallest = word;
			}
		}
		System.out.println(smallest);
	}

}
