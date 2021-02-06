package Lec2;

public class Inverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 32145;
		int num=0;
		int place=1;
		while(n!=0) {
			int rem = n%10;
			num = (int) (num + place*Math.pow(10, rem-1));
			place++;
			n=n/10;
		}
		System.out.println(num);

	}

}
