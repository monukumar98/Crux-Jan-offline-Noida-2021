package Lec7;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 4, 2, 1 };
		Sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void Sort(int[] arr) {

		for (int pass = 1; pass < arr.length; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;

				}

			}

		}
	}

	public static void Sort_Optimize(int[] arr) {
		boolean flag = true;
		for (int pass = 1; pass < arr.length; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
					flag = false;
				}

			}
			if (flag) {
				break;
			}
			flag = true;

		}
	}

}
