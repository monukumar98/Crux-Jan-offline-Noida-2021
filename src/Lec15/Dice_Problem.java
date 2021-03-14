package Lec15;

public class Dice_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Dice(0, 10, ""));

	}

	public static int Dice(int curr, int end, String ans) {
		// TODO Auto-generated method stub
		// +ve Base case
		if (curr == end) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++)
			count += Dice(curr + dice, end, ans + dice);
      return count;
	}

}
