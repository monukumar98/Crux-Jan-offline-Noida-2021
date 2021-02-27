package Lec9;

public class Two_D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr =null;
		System.out.println(arr);
		arr = new int[3][4];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[1][2]);
		arr[1][2]=9;
		for (int i = 0; i < arr.length; i++) {
			//int a[]=arr[i];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}



	}

}
