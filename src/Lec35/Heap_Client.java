package Lec35;

public class Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp = new Heap();
          hp.add(10);
          hp.add(20);
          hp.add(30);
          hp.add(40);
          hp.add(50);
          hp.add(60);
          hp.add(70);
          hp.add(5);
          hp.display();
          System.out.println(hp.remove());
          hp.display();
          System.out.println(hp.get());

         

	}

}
