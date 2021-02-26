package Lec8;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nop = sc.nextInt();
		
		int cook = sc.nextInt();
		int [] rank = new int [cook];
		for (int i = 0; i < rank.length; i++) {
			rank[i]=sc.nextInt();
			
		}
		Arrays.sort(rank);
		int lo=0;
		int hi=((rank[rank.length-1])*(nop*(nop+1)))/2;
		int ans =0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(rank,nop,mid)) {
				ans = mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		System.out.println(ans);

	}

	private static boolean isitpossible(int[] rank, int nop, int mid) {
		// TODO Auto-generated method stub
		int parantha=0;
		int time=0;
		int i=0;
		int pn=1;
		while(i<rank.length) {
			if(time+(pn*rank[i])<=mid) {
				time+=pn*rank[i];
				parantha++;
				pn++;
			}
			else {
				i++;
				time=0;
				pn=1;
			}
			if(parantha>=nop) {
				return true;
			}
			
		}
		return false;
	}

}
