package Lec17;

public class Coin_Changes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] Coin= {2,3,5};
       CoinChanges(Coin,10,0,"");
	}

	private static void CoinChanges(int[] coin, int ammount, int lastCOin_pick_Index,String ans) {
		// TODO Auto-generated method stub
		if(ammount==0) {
			System.out.println(ans);
			return ;
		}
		
		for(int i=lastCOin_pick_Index; i<coin.length; i++) {
			if(ammount-coin[i]>=0) {
				CoinChanges(coin, ammount-coin[i], i,ans+coin[i]);
			}
		}
		
	}

}
