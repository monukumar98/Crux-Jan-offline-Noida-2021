package Lec41;

import java.util.Arrays;


public class Unique3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,1,3,1,9,3};
		System.out.println(Uniquenumber3(arr));

	}
	public static int Uniquenumber3(int [] arr) {
		int [] ans = new int[32]; 
	
		for (int i = 0; i < arr.length; i++) {
			int pos =0;
			while(arr[i]!=0) {
				if((arr[i]&1)==1) {
					ans[pos]++;
				}
				pos++;
				arr[i]>>=1;
			}
			}
		int mul=1;
		int res=0;
		for (int i = 0; i < ans.length; i++) {
			ans[i]%=3;
			res+= (ans[i]*mul);
			mul*=2;
		}
		
		
		System.out.println(Arrays.toString(ans));
	return	res;
			
	}
	

}
