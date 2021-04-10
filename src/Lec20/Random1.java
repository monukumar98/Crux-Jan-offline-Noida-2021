package Lec20;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 1;
		int high = 600;
		Random rn = new Random();
		for (int i = 1; i < 10; i++) {
			int pivot = rn.nextInt(high - low) + low;
			System.out.println(pivot);
		}

	}

}
