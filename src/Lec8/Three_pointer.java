package Lec8;

import java.util.Arrays;

public class Three_pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,0,1,2,2,0};
		Arrays.sort(arr);
		//Sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void Sort(int []arr) {
		int one=0;
		int zero=0;
		int two=arr.length-1;
		while(zero<=two) {
			//  Case 1
			if(arr[zero]==0) {
				int t = arr[one];
				arr[one]=arr[zero];
				arr[zero]=t;
				one++;
				zero++;
			}
			else if(arr[zero]==2) {
				int t = arr[two];
				arr[two]=arr[zero];
				arr[zero]=t;
				two--;
			}
			else{
				zero++;
			}
		}
	}

}
