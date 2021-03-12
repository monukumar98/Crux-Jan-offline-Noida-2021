package Lec13;

import java.util.Scanner;

public class Maximum_sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();

			}
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = sc.nextInt();

			}
			int i = 0;
			int j = 0;
			int ans = 0;
			int p1=0;
			int q1=0;
			while (i < n && j < m) {
				if (arr1[i] < arr2[j]) {
					i++;
				} else if (arr1[i] > arr2[j]) {
					j++;
				} else {
					int sum1=0;
					int sum2=0;
					// First Array ka sum 
                   for(int p=p1; p<=i; p++) {
                	  sum1+=arr1[p]; 
                   }
                // Second  Array ka sum 
                   for(int p=q1; p<=j; p++) {
                 	  sum2+=arr2[p]; 
                    }
                   ans = ans + Math.max(sum1, sum2);
                    p1=i+1;
                    q1=j+1; 
                    i++;
                    j++;

				}

			}
			int sum1=0;
			int sum2=0;
			while(p1<n) {
				sum1+=arr1[p1];
				p1++;
			}
			while(q1<m) {
				sum2+=arr2[q1];
				q1++;
			}
			ans = ans + Math.max(sum1, sum2);
			System.out.println(ans);
			
			}

	}

}
