package Lec34;

import java.util.*;

public class Demo_Set {
	public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		System.out.println(set);
		System.out.println(set.contains(7));
		System.out.println(set.remove(1));
		System.out.println(set);

		
	}
}
