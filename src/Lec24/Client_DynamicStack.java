package Lec24;

import Lec23.Stack;

public class Client_DynamicStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack ds = new DynamicStack();
		for (int i = 1; i<=20; i++) {
			ds.push(i+9);
		}
		System.out.println(ds.peek());
		ds.display();

	}

}
