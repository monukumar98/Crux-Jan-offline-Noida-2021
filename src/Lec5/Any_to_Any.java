package Lec5;

public class Any_to_Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int ans =	any_to_dec(3, 121);
	//int ans =dec_toany_base(7,any_to_dec(3,121));
	System.out.println(dec_toany_base(7,any_to_dec(3,121)));

	}
	public static  int any_to_dec(int base, int n) {
		int ans =0;
		int mul=1;
		while(n>0) {
			int rem = n%10;
			ans = ans + rem*mul;
			mul= mul*base;
			n=n/10;
			
		}
		return ans;
	}
	public static  int dec_toany_base(int base, int n) {
		int ans =0;
		int mul=1;
		while(n>0) {
			int rem = n%base;
			ans = ans + rem*mul;
			mul= mul*10;
			n=n/base;
			
		}
		return ans;
	}


}
