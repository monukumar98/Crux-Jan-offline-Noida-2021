package Lec28;

public class GenerictreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 3  20 2 50 0 60 0 30 0 40 1 70 0
		GenericTree gt = new GenericTree();
		gt.display();
		System.out.println(gt.size());
		System.out.println(gt.ht());
		System.out.println(gt.max());
		System.out.println(gt.find(40));
		System.out.println(">>>>>>>>>>>>>>>>>");
		gt.PerOrder();
		System.out.println(">>>>>>>>>>>>>>>>>");
		gt.PostOrder();
		System.out.println(">>>>>>>>>>>>>>>>>");
		gt.levelorder();
		System.out.println(">>>>>>>>>>>>>>>>>");
		gt.levelorderLevelwise();

	}

}
