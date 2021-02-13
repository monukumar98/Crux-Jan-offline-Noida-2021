package Lec4;

public class Octal_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n = 356;
      int mul =1;
      int ans =0;
      while(n>0) {
    	  int rem = n%10;
    	  ans = ans + rem*mul;
    	  mul = mul*8;
    	  n/=10;
    	  
      }
      System.out.println(ans);
		
	}

}
