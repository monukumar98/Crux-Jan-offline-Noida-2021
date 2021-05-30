package Lec35;
import Lec32.Car;
public class Gen_Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic_Heap<Car> gp = new Generic_Heap<>();
		
		gp.add(new Car(3450, 30, "Yellow"));
		gp.add(new Car(1000, 120, "Black"));

		gp.add(new Car(2000, 100, "White"));

		gp.add(new Car(8907, 60, "Red"));

		gp.add(new Car(3400, 89, "Grey"));
		System.out.println(gp.get());


	}

}
