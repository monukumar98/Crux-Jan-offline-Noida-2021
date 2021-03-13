package lec14;

public class All_occ_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,1,3,4,1,3,1,3};
		int ans[] = all_occ(arr,1 ,0,0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
				

	}
	public static int[] all_occ(int arr[],int k,int i, int count) {
		if(i==arr.length) {
			int ans [] = new int[count];
			return ans;
		}
		if(arr[i]==k) {
			count++;
		}
		int ans[] =all_occ(arr, k, i+1, count);
		if(arr[i]==k) {
			ans[count-1]=i;
		}
		return ans;
	}

}
