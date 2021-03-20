package Lec16;

import java.util.ArrayList;

public class Different_Ways_to_Add_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add_Parentheses("2*3-4*5"));

	}
	public static ArrayList<Integer> Add_Parentheses(String Ques){
		 if(Ques.indexOf('+')==-1&& Ques.indexOf('-')==-1 && Ques.indexOf('*')==-1) {
			 ArrayList<Integer>  bs = new ArrayList<Integer>();
			 bs.add(Integer.parseInt(Ques));
			 return bs;
		 }
		 ArrayList<Integer>  ans = new ArrayList<Integer>();

		for (int i = 0; i <Ques.length(); i++) {
			char ch = Ques.charAt(i);
			if(ch=='+'|| ch=='-'|| ch=='*') {
				ArrayList<Integer> left= Add_Parentheses(Ques.substring(0,i));
				ArrayList<Integer> right= Add_Parentheses(Ques.substring(i+1));
     if(ch=='+') {
    	 for(int val : left) {
    		 for(int val1: right)
    		 ans.add(val+val1);
    	 }
    	 
     }
     if(ch=='-') {
    	 for(int val : left) {
    		 for(int val1: right)
    		 ans.add(val-val1);
    	 }
     }
     if(ch=='*') {
    	 for(int val : left) {
    		 for(int val1: right)
    		 ans.add(val*val1);
    	 }
     }
			}
			
			
		}
		return ans;
		
	}

}
