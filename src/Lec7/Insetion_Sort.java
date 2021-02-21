package Lec7;

import java.util.Arrays;

public class Insetion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 2, 4, 1 };
		Sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int counter = 1; counter < arr.length; counter++) {
			int j = counter - 1;
			int item = arr[counter];
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = item;
		}
	}

}
