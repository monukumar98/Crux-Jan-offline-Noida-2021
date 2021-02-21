package Lec7;

public class Reverse_In_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,9,77,67,56,78,90};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Reveser(arr,1,5);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static  void Reveser(int []arr,int i, int j) {
		
		while(i<j) {
			int t = arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}


}
