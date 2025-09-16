package programs;

public class BubbleSortNumber {

	public static void main(String[] args) {

		int nums[] = {6, 4, 3, 5, 1, 7, 8, 9, 2};
		int size = nums.length;
		int temp = 0;
		
		System.out.println("Before Sorting");
		
		for( int num : nums) {
			System.out.print(num + " ");
		}
		
		//it sort the number one by one so it takes the time
		
		for(int i=0; i<size; i++) 
		{
			for (int j=0; j<size-1; j++) 
			{				
				if(nums[j] > nums[j+1] )
				{
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				
			}
			
			System.out.println();
			for (int num : nums) {
				System.out.print(num + " ");
			}
			
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		
		
	}

}
