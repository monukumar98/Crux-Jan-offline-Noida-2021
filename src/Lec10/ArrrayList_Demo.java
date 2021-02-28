package Lec10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		Integer a2 = 10;
		Integer a3 = Integer.valueOf(a2);
		int [] arr = {1,2,3,3};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(a2);
		char [] ac= {'1','a','b'};
		System.out.println(ac);
		ArrayList<Integer> list=new ArrayList<>() ;
		System.out.println(list);
		System.out.println(list.size());
		list.add(10);
		list.add(20);
		
		list.add(0, 30);
		list.add(60);
		list.add(70);
		list.add(1,10);
		list.add(list.size(), 90);
		System.out.println(list);
		list.remove(1);
		list.set(list.size()-1, 80);
		System.out.println(list);
		Collections.sort(list);
		//list.
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(int val : list) {
			System.out.print(val+" ");
		}

		

	}

}
