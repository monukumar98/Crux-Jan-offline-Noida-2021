package Lec22;

import java.util.Scanner;

public class Generate_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		int ans[] = new int[a.length + b.length];
		GenerateSortedArray(a, b, ans, 0, 0, 0, false);

	}

	public static void GenerateSortedArray(int[] a, int[] b, int[] ans, int len, int i, int j, boolean flag) {
        // A se add krna hai 
		if(!flag) {
        	if(len!=0) {
        		display(ans, len);
        	}
        	for (int k = i; k <a.length; k++) {
        		if(len==0) {
        			ans[len]=a[k];
        			GenerateSortedArray(a, b, ans, len, k+1, j, true);
        		}
				 
        		if(ans[len]<a[k]) {
        			ans[len+1]=a[k];
        			GenerateSortedArray(a, b, ans, len+1, k+1, j, true);
        		}
			}
			
        }
		// B se Add hoga 
		else {
			for (int k = j; k < b.length; k++) {
				if(ans[len]<b[k]) {
        			ans[len+1]=b[k];
        			GenerateSortedArray(a, b, ans, len+1, i, k+1, false);
        		}
			}
		}
		
		
		
		
	}
	public static void display(int []arr, int len) {
		for (int i = 0; i <=len; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
