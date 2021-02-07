package Lec3;

public class Pattern3 {
	public static void main(String[] args) {
		int  n = 5;
		int row=1;
		int nsp=0;
		int nst =n;
		while(row<=n) {
			// space
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			// star
			int cst =1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			// next row
			nsp+=2;// nsp = nsp +2
			nst--;
			row++;
			System.out.println();
			
		}
	}

}
