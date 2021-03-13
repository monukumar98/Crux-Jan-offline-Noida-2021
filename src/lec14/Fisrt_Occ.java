package lec14;

public class Fisrt_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr = {2,3,1,3,4,1,3,1,3};
     System.out.println(first_occ(arr, 0, 1));
     System.out.println(Last_occ(arr, arr.length-1, 1));
     All_occ(arr, 0, 1);
	}
public static int first_occ(int arr[],int i, int k) {
	if(i==arr.length) {
		return -1;
	}
	if(arr[i]==k) {
		return i;
	}
	return first_occ(arr, i+1, k);
}
public static int Last_occ(int arr[],int i, int k) {
	if(i<0) {
		return -1;
	}
	if(arr[i]==k) {
		return i;
	}
	return Last_occ(arr, i-1, k);
}
public static void All_occ(int arr[],int i, int k) {
	if(i==arr.length) {
		return ;
	}
	if(arr[i]==k) {
		System.out.print(i+" ");
		
	}
	 All_occ(arr, i+1, k);
}
}
