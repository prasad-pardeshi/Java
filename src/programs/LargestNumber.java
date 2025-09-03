package programs;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,2,3,55,23,876};
		int max = num[0];
		
		for(int i=1; i<num.length; i++)
		{
			if(num[i]>max) {
				max=num[i];
				
			}
		}
		
		System.out.println(max);
	}

}
