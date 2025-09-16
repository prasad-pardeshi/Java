package programs;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Madam";
			
		//if string contains caps and small letters, convert string lower or upper case and then proceed
		String name = str.toLowerCase().toString();
		String reversed = new StringBuilder(name).reverse().toString();
		System.out.println(name.equals(reversed));
		
		
		

	}

}
