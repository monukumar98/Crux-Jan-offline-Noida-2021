package Lec7;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,5,7,8,9,11,14};
		System.out.println(Binary_Search(arr, 8));

	}
	public static int Binary_Search(int []arr,int item) {
		int lo=0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
			
		}
		return -1;
	}

}
