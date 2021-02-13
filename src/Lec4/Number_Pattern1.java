package Lec4;

public class Number_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nsp = n - 1;
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
			int val = row;
			while (cst <= nst) {
				System.out.print(val + " ");
				if (cst <= nst/2)
					val++;
				else
					val--;
				cst++;
			}

			// next row
			nsp--;
			nst += 2;
			row++;
			System.out.println();

		}

	}

}
