package programs;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,6,5,464,122,124,334,456};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if (num>first) {
				second = first;
				first = num;
			}
			else if(num> second && num != first){
				second = num;
			}
		}
		System.out.println(second);
		
	}

}
