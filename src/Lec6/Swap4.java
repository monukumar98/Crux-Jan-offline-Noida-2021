package Lec6;

public class Swap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50 };
		int [] other = arr;
//		int other[] = { 100, 200, 300, +400, 500 };
//		System.out.println(arr[0]+" "+other[0]);
//		Swap(arr, other);
//		System.out.println(arr[0]+" "+other[0]);

		
	}
	public static void Swap(int []arr,int []other) {
		int [] t = arr;
		arr=other;
		other=t;
	}

}
