package Lec40;

public class SetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=345;
		int bit=4;
		int mask = (1<<bit);
		mask=~(mask);
		n = (n&mask);
		System.out.println(n);

	}

}
