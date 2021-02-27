package Lec9;

public class Jagged_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] jag = new int [3][];
		System.out.println(jag[0]);
		jag[0]=new int [3];
		System.out.println(jag[0][0]);
		jag[1]=new int [4];
		jag[2]= new int [2];
		for (int i = 0; i < jag.length; i++) {
			for (int j = 0; j < jag[i].length; j++) {
				System.out.print(jag[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("................");
		for (int i = 0; i < jag.length; i++) {
		jag[i]=new int [(i+1)*3];	
		}
		for (int i = 0; i < jag.length; i++) {
			for (int j = 0; j < jag[i].length; j++) {
				System.out.print(jag[i][j]+" ");
			}
			System.out.println();
		}

	}

}
