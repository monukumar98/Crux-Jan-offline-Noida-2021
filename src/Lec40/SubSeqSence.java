package Lec40;

public class SubSeqSence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSeq("abc");

	}
	public static void SubSeq(String str) {
		int n = str.length();
		for (int i = 0; i < (1<<n); i++) {
			pattern(i,str);
			
		}
	}
	private static void pattern(int i, String str) {
		// TODO Auto-generated method stub
		int id=0;
		while(i!=0) {
			if((i&1)==1) {
				System.out.print(str.charAt(id));
			}
			id++;
			i>>=1;
			
		}
		System.out.println();
		
	}

}
