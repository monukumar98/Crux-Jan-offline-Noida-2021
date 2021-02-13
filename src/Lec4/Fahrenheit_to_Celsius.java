package Lec4;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int minf= sc.nextInt();
		int maxf=sc.nextInt();
		int steps=sc.nextInt();
		for(int temp = minf; temp<=maxf; temp+=steps) {
			int c = (int) ((5.0/9)*(temp-32));
			System.out.println(temp+" "+c);
		}
		

	}

}
