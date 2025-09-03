package programs;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10; // Number of Fibonacci numbers to print
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		
		for(int i=2; i<n; i++) {
			int c = a+b;
			System.out.println(c + " ");
			a = b;
			b = c;
		}
		
	}

}
