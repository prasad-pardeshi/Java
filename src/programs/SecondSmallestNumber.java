package programs;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12,1,2,3,45,6,5,10,24,34};
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if (num < first) {
				second = first;
				first = num;
			}
			else if(num < second && num != first){
				second = num;
			}
		}
		 
		System.out.println(second);
	}

}
