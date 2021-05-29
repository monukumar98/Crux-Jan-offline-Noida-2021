package Lec33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Sort_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Employees> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
			String name = sc.next();
			int salary = sc.nextInt();
			if(salary>=x) {
				list.add(new Employees(name, salary));
			}
		}
       // Integer
        ArrayList<Integer> ll = new ArrayList<Integer>();
        ll.add(14);
        ll.add(6);
        Collections.sort(list , new Comparator<Employees>() {

			@Override
			public int compare(Employees e1, Employees e2) {
				// TODO Auto-generated method stub
				if(e1.Esalary==e2.Esalary) {
					return e1.Ename.compareTo(e2.Ename);
				}
				else
					return e2.Esalary-e1.Esalary;
			}
        	
		});
        System.out.println(list);
	}

	private static class Employees  {
		String Ename;
		int Esalary;

		public Employees(String Ename, int Esalary) {
			// TODO Auto-generated constructor stub
			this.Ename = Ename;
			this.Esalary = Esalary;
		}

		@Override
		public String toString() {
			return this.Ename + " " + this.Esalary;
		}
	}

}
