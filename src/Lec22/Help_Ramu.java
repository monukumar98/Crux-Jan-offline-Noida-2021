package Lec22;
import Lec23.Student;
import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		int t = sc.nextInt();
		while (t > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int nor = sc.nextInt();
			int noc = sc.nextInt();
			int[] ride_of_r = new int[nor];
			int[] ride_of_c = new int[noc];
			for (int i = 0; i < ride_of_r.length; i++) {
				ride_of_r[i] = sc.nextInt();
			}
			for (int i = 0; i < ride_of_c.length; i++) {
				ride_of_c[i] = sc.nextInt();
			}
			int ans = minimum_ruppees(c1, c2, c3, c4, ride_of_r, ride_of_c);
			System.out.println(ans);
			t--;
		}

	}

	public static int minimum_ruppees(int c1, int c2, int c3, int c4, int[] ride_of_r, int[] ride_of_c) {
		// TODO Auto-generated method stub
		int ammount_r = 0;
		int ammount_c = 0;
		for (int i = 0; i < ride_of_r.length; i++) {
			ammount_r = ammount_r + Math.min(c1 * ride_of_r[i], c2);

		}
		for (int i = 0; i < ride_of_c.length; i++) {
			ammount_c = ammount_c + Math.min(c1 * ride_of_c[i], c2);
		}
		ammount_r = Math.min(ammount_r, c3);
		ammount_c = Math.min(ammount_c, c3);
		int ans = ammount_r + ammount_c;
		ans = Math.min(ans, c4);
		return ans;
	}

}
