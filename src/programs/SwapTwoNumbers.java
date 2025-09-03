package programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b= 20;
		
		 System.out.println("Value of a is " +a +" and " + "Value of b is " +b +" Before Swapping");
		 
		 a = a+b;
		 b= a-b;
		 a= a-b;
		 
		 System.out.println("Value of a is " +a);
		 System.out.println("Value of b is " +b);
		
		
		
		
	}

}
