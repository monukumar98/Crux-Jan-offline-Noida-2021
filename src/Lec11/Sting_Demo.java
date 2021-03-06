package Lec11;
import java.util.*;
public class Sting_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		String str = "Hello";
		String str1="Hello";
//		str = str + "Hey";
//	    str1=str1+"bey";
		System.out.println(10+20+"bye"+30+40);
	    System.out.println(" "+str.length());
	    System.out.println(" "+str.charAt(4));
	    System.out.println(str.concat("100"));
	    System.out.println(str.isEmpty());
	    System.out.println(str.substring(0));
	    System.out.println(str.substring(1, 4));
	    System.out.println(str.substring(1,1));
	    String s1 = new String("Bye");
	    System.out.println(s1);
	  //  String s2 = sc.next();
	    String s2 = new String("bye");
	    System.out.println(s1.equals(s2));// false
	    System.out.println(s1==s2);//false
	    System.out.println(str==str1);// true
	    System.out.println(str.equals(str1));//true
	    long start =  System.currentTimeMillis();
	    		
         System.out.println(Append());
         long end = System.currentTimeMillis();
         System.out.println(end-start);
	    
	}
	public static String Append()
	{
		int n=100000;
		String s="";
		for (int i = 0; i < n; i++) {
			s=s+i;
		}
		return s;
		
	}
}
