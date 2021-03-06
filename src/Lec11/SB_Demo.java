package Lec11;

import java.util.*;

public class SB_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append('a');
		sb.append('d');
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		String s="monu";
		StringBuilder sb1 = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		sb.append('c');
		sb.append("ams");
		System.out.println(sb);
		//sb.deleteCharAt(2);
		sb.delete(1, 3);
		System.out.println(sb.substring(1, 3));
		System.out.println(sb);
		sb.insert(2, 'z');
		System.out.println(sb);
		long st = System.currentTimeMillis();
		System.out.println(fun());
		long ei = System.currentTimeMillis();
		System.out.println(ei-st);
		
	}
	public static String fun() {

		// concatenation
		StringBuilder sb = new StringBuilder();
for (int i = 0; i <100000; i++) {
	sb.append(i);
}
	return sb.toString();	

}
}
