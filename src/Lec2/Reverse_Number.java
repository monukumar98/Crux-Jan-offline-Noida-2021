package Lec2;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =123;
		
		int num=0;
		while(n!=0) {
			int rem = n%10;
			num= num*10 + rem; 
			n/=10;
		}
		System.out.println(num);

	}

}
