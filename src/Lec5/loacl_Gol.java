package Lec5;

public class loacl_Gol {
	public static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		int a = 10;
		int b = 5;
		System.out.println(a + " " + b);
		val = swap(a, b);
		System.out.println(a + " " + b);
		
		System.out.println(val);

	}

	public static int swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);

		val+=18;
		System.out.println(val);
		int val =78;
		val+=10;
		System.out.println(val);
		return val;
		
	}
}
