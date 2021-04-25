package Lec25;
import java.util.*;
public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 80, 50, 70, 30, 20, 40, 90, 10, 5,35};

		stockSpan(arr);
	}
	public static void stockSpan(int []arr) {
		int [] ans = new int [arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
			
		}
		System.out.println(Arrays.toString(ans));
	}

}
