package Lec3;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =0;
		int n =7;
		while(row<n) {
			int val=1;
			int r =0;
			while(r<=row) {
				System.out.print(val+" ");
				val= (val*(row-r))/(r+1);
				r++;
			}
			// next row
			row++;
			System.out.println();
		}

	}

}
