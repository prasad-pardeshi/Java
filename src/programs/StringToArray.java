package programs;

public class StringToArray {
  public static void main(String[] args) {
   
	  String name = "prasad";
	  
	  char[] ch = name.toCharArray();
	  
	  //System.out.println(ch[0]);
	  
	  for(char i : ch) {
		  System.out.print(i);
	  }
	  
	  
  }
}
