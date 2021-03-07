package Lec12;

public class Recursion_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PD(5);

	}
	public static void PD(int n) {
		if(n==0)
			return ;
		// Tail Recursion
		System.out.println(n);
		PD(n-1);
	}

}
