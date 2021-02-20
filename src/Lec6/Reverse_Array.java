package Lec6;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		Reveser(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static  void Reveser(int []arr) {
		int i=0;
		int j = arr.length-1;
		while(i<j) {
			int t = arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}

}
