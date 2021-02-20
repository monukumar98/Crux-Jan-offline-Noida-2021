package Lec6;

public class Swap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] other= {100,200,300,400,500};

//		// Method 1
//		System.out.println(arr[0]+" "+arr[1]);
//		Swap(arr[0],arr[1]);
//		System.out.println(arr[0]+" "+arr[1]);
//		// Method 2
		System.out.println(arr[0]+" "+other[0]);
//		Swap1(arr,0,1);
//		System.out.println(arr[0]+" "+arr[1]);
		Swap2(arr[0], other[0]);
		System.out.println(arr[0]+" "+other[0]);
		Swap3(arr, other, 0);
		System.out.println(arr[0]+" "+other[0]);



	}
	public static void Swap1(int [] arr,int i, int j) {
		int t = arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	public static void Swap3(int [] arr,int []other,int i) {
		int t = arr[i];
		arr[i]=other[i];
		other[i]=t;
	}
	public static void Swap2(int a, int b) {
		int t = a;
		a=b;
		b=t;
	}
	public static void Swap(int a, int b) {
		int t = a;
		a=b;
		b=t;
	}

}
