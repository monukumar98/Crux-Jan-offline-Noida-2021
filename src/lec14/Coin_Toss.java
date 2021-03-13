package lec14;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin_Toss(3,"");
		System.out.println();
		Coin_Toss_not_cons_head(4, "");
		System.out.println();
		Coin_Toss_not_cons_head2(4, "",false);


	}

	public static void Coin_Toss(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.print(ans+" ");
			return; 
		}
		// Head
		Coin_Toss(n-1, ans+"H");
		// Tail
		Coin_Toss(n-1, ans+"T");
	}
	public static void Coin_Toss_not_cons_head(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.print(ans+" ");
			return; 
		}
		// Head
		if(ans.length()==0 ||ans.charAt(ans.length()-1)!='H') {
		Coin_Toss_not_cons_head(n-1, ans+"H");
		}
		// Tail
		Coin_Toss_not_cons_head(n-1, ans+"T");
	}
	public static void Coin_Toss_not_cons_head2(int n, String ans,boolean flage) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.print(ans+" ");
			return; 
		}
		// Head
		//if(ans.length()>=1 &&ans.charAt(ans.length()-1)!='H') {
		if(!flage)
		Coin_Toss_not_cons_head2(n-1, ans+"H",true);
		
		// Tail
		Coin_Toss_not_cons_head2(n-1, ans+"T",false);
	}

}
