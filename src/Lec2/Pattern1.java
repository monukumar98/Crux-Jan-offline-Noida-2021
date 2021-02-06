package Lec2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		int row=1;
		int nst =1;
		
		while(row<=n) {
			// Self Work
			int cst =1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			// next row ki prepar
			row++;
			nst++;
			System.out.println();
			
		}

	}

}
