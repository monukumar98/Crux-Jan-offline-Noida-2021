package Lec5;

public class Print_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =20;
		int y =60;
		for (int i = 2; i <=20; i++) {
			if(check_prime(i)) {
			System.out.println(" "+i);
			y=60;
			}
		}
		if(true) {
			int sum=0;
		}
		
		

	}

	public static boolean check_prime(int n) {

		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				return false;
			}
			i++;

		}
		return true;
	}
}
