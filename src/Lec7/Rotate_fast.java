package Lec7;

public class Rotate_fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,9,77,67,56,78,90};
//		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		roatateFast(arr,3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print
			(arr[i]+" ");
		}


	}
public  static void roatateFast(int[] arr, int k) {
		// TODO Auto-generated method stub
	int j=arr.length-k-1;
	Reveser(arr, 0, j);
	Reveser(arr, j+1, arr.length-1);
	Reveser(arr, 0, arr.length-1);
	
		
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
