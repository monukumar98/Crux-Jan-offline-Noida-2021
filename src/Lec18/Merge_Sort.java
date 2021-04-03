package Lec18;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr = {8,7,1,5,3};
         arr = MergeSort(arr, 0, arr.length-1);
         for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int [] MergeSort(int []arr,int si,int ei) {
		
		if(si==ei) {
			int bs [] = new int [1];
			bs[0]=arr[si];
			return bs;
			
		}
		int mid =(si+ei)/2;
		int fs[] = MergeSort(arr, si, mid);
		int sh[]=MergeSort(arr, mid+1, ei);
		return mergetwosortedarray(fs, sh);
		
	}
	public static int [] mergetwosortedarray(int []arr1,
			int []arr2) {
		int ans [] = new int [arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			}
			else {
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		
		while(j<arr2.length) {
			ans[k]=arr2[j];
			k++;
			j++;
		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			k++;
			i++;
		}
		return ans;
	
	}
}
