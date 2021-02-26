package Lec8;

import java.util.Scanner;

public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		int nob = sc.nextInt();
		int nos=sc.nextInt();
		
		int [] books = new int [nob];
		for (int i = 0; i < books.length; i++) {
			books[i]=sc.nextInt();
		}
		int lo=0;
		int hi=0;
		for(int val : books) {
			hi+=val;
		}
		int ans=0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(books,nos,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else
			lo=mid+1;
			
		}
		System.out.println(ans);
		t--;
		}
	}

	public static boolean isitpossible(int[] books, int nos, int mid) {
		// TODO Auto-generated method stub
		int student=1;
		int page_read=0;
		int i=0;
		while(i<books.length) {
			if(page_read+books[i]<=mid) {
				page_read+=books[i];
				i++;
			}
			else {
				page_read=0;
				student++;
			}
			if(student>nos) {
				return false;
			}
			
			
		}
		
		return true;
	}

}
