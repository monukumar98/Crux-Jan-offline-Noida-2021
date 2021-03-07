package Lec12;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(fibo(4));
	}
	public static int fibo(int n) {
		// Base Case
		if(n==0 || n==1) {
			return n;
		}
		int fn1= fibo(n-1);
		int fn2 = fibo(n-2);
		return fn1+fn2;
	}

}
