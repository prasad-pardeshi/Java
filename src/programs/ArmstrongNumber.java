package programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 573; 
		int sum = 0;
		int temp = num;
		
		while(temp!=0) {
			int digit = temp % 10;
			sum += Math.pow(digit, 3);
				temp /= 10;
		}
		System.out.println(num == sum);
	}

}
