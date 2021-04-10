package Lec20;

import java.util.Arrays;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prime_Sieve(50);

	}

	public static boolean[] Prime_Sieve(int n) {
		boolean[] prime = new boolean[n + 1];

		prime[0] = true;// not prime
		prime[1] = true;// not prime
		// false -->prime
		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == false) {
				for (int j = 2; j * i <= n; j++) {

					prime[j * i] = true;
				}
			}
		}
		return prime;

	}
}
