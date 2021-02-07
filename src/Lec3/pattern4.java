package Lec3;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nsp = 2;
		int nst = 1;
		while (row <= n) {
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			// next row
			row++;
			System.out.println();
			if (row <= n / 2+1) {

				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2;
			}
		}
	}

}
