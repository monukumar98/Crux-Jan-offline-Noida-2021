package Lec1;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int a = 0;
		int b = 1;
		int i = 1;
		while (i <= n) {
			int sum = a + b;
			a = b;
			b=sum;
			i=i+1;

		}
		System.out.println(a);

	}

}
