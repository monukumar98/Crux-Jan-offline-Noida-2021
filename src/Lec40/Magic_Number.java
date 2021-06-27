package Lec40;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		System.out.println(magic(n));

	}
	public static int magic(int n) {
		int ans =0;
		int mul=5;
		while(n!=0) {
			if((n&1)==1) {
				ans+=mul;
			}
			mul*=5;
			n>>=1;
		}
		return ans;
	}

}
