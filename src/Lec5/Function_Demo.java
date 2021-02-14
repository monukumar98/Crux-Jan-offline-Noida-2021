package Lec5;

import java.util.Scanner;

public class Function_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long ll = sc.nextLong();
		boolean b = sc.nextBoolean();
		char ch = sc.next().charAt(0);
//		int n1 =7;
//		int n2 =9;
//		int n3 = n1+n2;
//		System.out.println(n3);
		System.out.println("hello");
		System.out.println("hey");
		//addtion();
		System.out.println("bye");
		int a =19;
		int b =4;
		addtionpara(a, b);
		System.out.println("bye bye");
		int c =addtionpara1(a, b);
		System.out.println(addtionpara1(a, b));

	}
	public static void addtion() {
		int a =10;
		int b =20;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void addtionpara(int a , int b) {
		
		int c = a+b;
		System.out.println(c);
	}
public static int addtionpara1(int a , int b) {
		
		int c = a+b;
		//System.out.println(c);
		return c;
	}
}
