package Lec3;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =1;
		int n =6;
		while(row<=n) {
			int val=1;
			int r =1;
			while(r<=row) {
				System.out.print(val+" ");
				val= (val*(row-r))/(r);
				r++;
			}
			// next row
			row++;
			System.out.println();
		}

	}

}
