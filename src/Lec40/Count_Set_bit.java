package Lec40;

public class Count_Set_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =25;
		System.out.println(CountSetbit(n));
		System.out.println(Fast_CountSetbit(n));

	}
	public static int CountSetbit(int n) {
		int ans =0;
		while(n!=0) {
			if((n&1)==1) {
				ans++;
			}
			n>>=1;
		}
		return ans;
		
	}
	public static int Fast_CountSetbit(int n) {
		int ans =0;
		while(n!=0) {
			ans++;
			n=(n&(n-1));
		}
		return ans;
		
	}

}
