package Lec15;

public class Lexico_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       lexico_count(0,1000);
	}

	public static void lexico_count(int curr, int end) {
		// TODO Auto-generated method stub
		
		if(curr>end) {
			return ;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		
		for (; i <=9; i++) {
			lexico_count(curr*10+i, end);
		}
		
	}

}
