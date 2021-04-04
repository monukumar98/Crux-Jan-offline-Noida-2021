package Lec19;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,7,3,2,5};
		QuickSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void QuickSort(int []arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int pi=pivote_Index(arr, si, ei);
		QuickSort(arr, si, pi-1);
		QuickSort(arr, pi+1, ei);
	}
public static int pivote_Index(int []arr, int si, int ei) {
	int pivote=arr[ei];
	int pi=si;
	for (int i = si; i <ei; i++) {
		if(arr[i]<pivote) {
			int t = arr[i];
			arr[i]=arr[pi];
			arr[pi]=t;
			pi++;
		}
		
	}
	int t = arr[ei];
	arr[ei]=arr[pi];
	arr[pi]=t;
	return pi;
}
}
