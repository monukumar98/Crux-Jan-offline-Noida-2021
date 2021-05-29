package Lec34;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,5,8,9,3,4,10,11,1,16,15};
		System.out.println(LongestConsecutiveSequence(arr));

	}
	public static int LongestConsecutiveSequence(int [] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		int ans=0;
		for (int key : arr) {
			if(map.containsKey(key-1)) {
				map.put(key, false);
			}
			else {
				map.put(key, true);
			}
			if(map.containsKey(key+1)) {
				map.put(key+1, false);
			}
		}
		
		System.out.println(map);
		 for(int key : map.keySet()) {
			 if(map.get(key)) {
				 int count=0;
				 while(map.containsKey(key+count)) {
					 count++;
				 }
				ans = Math.max(count, ans);
			 }
		 }
		
		return ans;
	}

}
