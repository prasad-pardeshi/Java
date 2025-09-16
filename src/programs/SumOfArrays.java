package programs;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {1, 2, 3, 5, 6, 7, 8, 9};
		
		int sum = 0;
		
		for (int i=0; i<myArray.length; i++) {
			sum += myArray[i];
		}
		
		System.out.println(sum);
	}

}
