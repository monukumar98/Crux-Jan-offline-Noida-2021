package Lec15;

public class PerMutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		All_permuation("abc","");

	}

	public static void All_permuation(String Ques, String ans) {
		// TODO Auto-generated method stub
		//Base Case
		if(Ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		 char ch = Ques.charAt(0);
		for (int i = 0; i <=ans.length(); i++) {
		ans=ans.substring(0,i)+ch+ans.substring(i);
			All_permuation(Ques.substring(1), ans);
		}
		
	}

}
