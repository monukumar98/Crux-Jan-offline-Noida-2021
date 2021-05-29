package Lec33;

import java.util.Arrays;
import java.util.Comparator;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pair[] pp = new pair[5];
		pp[0] = new pair("Shivam", 86);
		pp[1] = new pair("Rohan", 78);
		pp[2] = new pair("pooja", 98);
		pp[3] = new pair("Mohan", 78);
		pp[4] = new pair("Vishal", 77);
		Arrays.sort(pp, new Comparator<pair>() {

			@Override
			public int compare(pair o1, pair o2) {
				// TODO Auto-generated method stub\
				if(o1.marks==o2.marks) {
					return o1.name.compareTo(o2.name);
				}
				else {
					return o1.marks-o2.marks;
				}
				
			}
		});
		System.out.println(Arrays.toString(pp));

	}

	public static class pair{// implements Comparable<pair> {
		String name;
		int marks;

		public pair(String name, int marks) {
			// TODO Auto-generated constructor stub
			this.marks = marks;
			this.name = name;
		}
		public String toString() {
			return this.name+" "+this.marks;
		}

//		@Override
//		public int compareTo(pair o) {
//			// TODO Auto-generated method stub
//			return this.marks-o.marks;
//		}
	}

}
