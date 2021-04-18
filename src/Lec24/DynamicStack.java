package Lec24;

import Lec23.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (this.isfull()) {
			int[] arr = new int[this.data.length * 2];
			for (int i = 0; i < this.data.length; i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;
		}
		super.push(item);
		
	}
}
