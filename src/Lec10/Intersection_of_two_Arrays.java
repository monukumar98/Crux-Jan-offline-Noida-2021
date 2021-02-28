package Lec10;

import java.util.ArrayList;

public class Intersection_of_two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,3,5,7,8,10};
		int [] arr1 = {3,3,3,3,5,5,7,10,10,11};
		int i=0;
		int j=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i<arr.length && j<arr1.length) {
			if(arr[i]==arr1[j]) {
				list.add(arr[i]);
				i++;
				j++;
			}
			else if(arr[i]<arr1[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		System.out.println(list);

	}

}
