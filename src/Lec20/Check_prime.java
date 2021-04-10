package Lec20;

public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Checkprime(2));

	}
	public static boolean Checkprime(int n) {
		// Sqrt(n)
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
