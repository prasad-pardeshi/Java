package programs;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9, 5, 2, 8, 34, 8, 2};
		
		int largest = arr[0];
		
		for(int num : arr) {
			if(num > largest) {
				largest = num;
			}
		}
		System.out.println(largest);

	}

}
