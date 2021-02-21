package Lec7;

public class Linear_Sreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 35, 7, 91, 34 };
		System.out.println(Linear_Search(arr, -7));
	}

	public static int Linear_Search(int[] arr, int item) {
      for (int i = 0; i < arr.length; i++) {
		if(arr[i]==item) {
			return i;
		}
	}
      return -1;
	}
}
