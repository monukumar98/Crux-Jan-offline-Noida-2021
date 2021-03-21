package Lec17;

public class Coin_Permutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {2,3,5};
		CoinChanges(coin, 10, "");

	}
	private static void CoinChanges(int[] coin, int ammount,String ans) {
		// TODO Auto-generated method stub
		if(ammount==0) {
			System.out.println(ans);
			return ;
		}
		
		for(int i=0; i<coin.length; i++) {
			if(ammount-coin[i]>=0) {
				CoinChanges(coin, ammount-coin[i],ans+coin[i]);
			}
		}

}
}
