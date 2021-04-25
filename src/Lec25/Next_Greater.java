package Lec25;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 9, 13, 21, 3 };
		next_greater(arr);

	}

	public static void next_greater(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ans.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}

			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		System.out.println(Arrays.toString(ans));
	}

}
