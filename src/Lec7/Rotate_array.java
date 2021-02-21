package Lec7;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(-16%7);
		int [] arr = {1,2,3,4,5,9,77,67,56,78,90};
//		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		roatate_Array(arr,3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void roatate_Array(int []arr,int k) {
		k=k%arr.length;
		if(k<0)
		k=(k+arr.length);
		
		for(int rot =1; rot<=k; rot++) {
		int t = arr[arr.length-1];
		for(int i=arr.length-1; i>=1; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=t;
		}
	}

}
