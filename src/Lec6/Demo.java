package Lec6;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
//		a = 9;
		int a = 9;
//		int[] arr;
//		arr = null;
		System.out.println(a);
		// System.out.println(arr);
		int arr[] = new int[5];
		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[-1]);
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			arr[i]=10*(i+2);
		}
		System.out.println();
		System.out.println("..............");
//		for (int i = arr.length-1; i >=0; i--) {
//			System.out.print(arr[i]+" ");
//			
//		}
		System.out.println();
		System.out.println("..............");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int val: arr) {
			System.out.print(val+" ");
			val=100;
		}
		System.out.println();
		for(int val: arr) {
			System.out.print(val+" ");
			//val=100;
		}
//		char [] carr = new char [3];
//		carr[0]='p';
//		carr[1]='m';
//		carr[2]='E';
//		System.out.println();
//		for(char val: carr) {
//			System.out.print(val+" ");
//			break;
//		}
//		

	}

}
