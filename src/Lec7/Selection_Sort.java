package Lec7;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 1, 2, 3 };
		Sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			 int min =i;
			for(int j=i+1;j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int t = arr[i];
			arr[i]=arr[min];
			arr[min]=t;
		}
		
	}

}
