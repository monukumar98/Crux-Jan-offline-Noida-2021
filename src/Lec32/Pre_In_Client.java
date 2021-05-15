package Lec32;

public class Pre_In_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pre [] = {10,20,40,50,30,70};
		int in[]= {40,20,50,10,30,70};
		Tree_Build_Pre_in pi= new Tree_Build_Pre_in(in, pre);
		pi.display();

	}

}
