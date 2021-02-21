package Lec7;

public class Min_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Min_Value(int[] arr) {
		int min=Integer.MAX_VALUE;
     for(int  i=0; i<arr.length; i++) {
    	 if(arr[i]<min) {
    		 min=arr[i];
    	 }
     }
     return min;
	}
	public static int Min_Value_idx(int[] arr) {
		int min=Integer.MAX_VALUE;
		int j=-1;
     for(int  i=0; i<arr.length; i++) {
    	 if(arr[i]<min) {
    		 min=arr[i];j=i;
    	 }
     }
     return j;
	}
}
