package Lec25;

import Lec24.DynamicStack;

public class StackReverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.display();
//		DynamicStack Sec = new DynamicStack();
//		reverse(ds, Sec);
		reverseStack(ds);
		ds.display();

	}

	public static void reverse(DynamicStack primary, DynamicStack Sec) throws Exception {
		while (!primary.isempty()) {
			Sec.push(primary.pop());
		}

		DynamicStack temp = new DynamicStack();
		while (!Sec.isempty()) {
			temp.push(Sec.pop());
		}
		while (!temp.isempty()) {
			primary.push(temp.pop());
		}
		// primary.display();
	}

	public static void reverseStack(DynamicStack pri) throws Exception {
       if(pri.isempty()) {
    	   return;
       }
		int item = pri.pop();
		reverseStack(pri);
		Insert_last(pri,item);

	}

	private static void Insert_last(DynamicStack pri, int item) throws Exception {
		// TODO Auto-generated method stub
		if(pri.isempty()) {
			pri.push(item);
	    	   return;
	       }
			int item1 = pri.pop();
			Insert_last(pri,item);
			pri.push(item1);
		
		
	}

}
