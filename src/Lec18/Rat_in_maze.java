package Lec18;

import java.util.Scanner;

public class Rat_in_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char [] [] arr = new char[n][m];
		for (int i = 0; i <n; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j]=str.charAt(j);
			}
			
		}
		
		print_path(arr, 0, 0, m-1,n-1, new boolean[n][m]);

	}
	public static void print_path(char [][]arr,int cc,int cr
			,int ec,int er, boolean [][]ans) {
		if(cc==ec && cr==er) {
			if(arr[cr][cc]!='X') {
				ans[cr][cc]=true;
				for (int i = 0; i < ans.length; i++) {
					for (int j = 0; j < ans[0].length; j++) {
						System.out.print(ans[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println();
				ans[cr][cc]=false;

			}
			return;
		}
		
		
  if( cc<0 || cr<0|| cc>ec || cr>er || arr[cr][cc]=='X'|| 
    ans[cr][cc] ) {
			
			return ;
		}
		int r [] = {1,0,0,-1};
		int c[] = {0,-1,1,0};
		for (int i = 0; i < c.length; i++) {
			
			ans[cr][cc]=true;
			arr[cr][cc]='X';
			print_path(arr, cc+c[i], cr+r[i], ec, er,ans);
			ans[cr][cc]=false;
			arr[cr][cc]='O';
		}
		
	}

}
