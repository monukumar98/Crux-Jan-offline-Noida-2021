package Lec34;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionoftwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,3,4,5,2,1,3,4,5,9};
		int arr1[] = {2,3,1,3,4,5,1,7,4,5,9};
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i])+1);
			}
			else {
				map.put(arr1[i], 1);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]) && map.get(arr[i])>0) {
				list.add(arr[i]);
				map.put(arr[i], map.get(arr[i])-1);
			}
		}
		System.out.println(list);

	}

}
