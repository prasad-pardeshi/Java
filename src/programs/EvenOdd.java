package programs;

import java.util.ArrayList;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1,6,3,6,71,34,2356,596,90};
		
		ArrayList even = new ArrayList();
		ArrayList odd = new ArrayList();
		
		for(int num : numbers) {
			if(num % 2 == 0) {
				even.add(num);
			}
			else {
				odd.add(num);
			}
		}
		System.out.println("Even Numbers "+ even);
		System.out.println("Odd Numbers "+ odd);
		
	}

}
