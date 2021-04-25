package Lec25;

import java.util.*;

public class Celebrity_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		Celb_Cand(arr);
	}

	public static void Celb_Cand(int[][] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		while (st.size() != 1) {
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 1) {
				st.push(b);
			} else {
				st.push(a);
			}
		}
		int a = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if (i != a) {
				if (arr[a][i] == 1 || arr[i][a] == 0) {
					System.out.println("Not Cleb");
					return;
				}
			}

		}
		System.out.println("cele " + a);

	}

}
