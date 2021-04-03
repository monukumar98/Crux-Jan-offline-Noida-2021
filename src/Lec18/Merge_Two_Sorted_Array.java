package Lec18;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2,3,5,7,8,9};
		int []arr2 = {1,3,6,7,9,11,13};
		int ans[] = mergetwosortedarray(arr1, arr2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

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
