package Lec32;

public class Car implements Comparable<Car> {
	public int price;
	public int speed;
	public String color;

	public Car(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "P: " + this.price + " S: " + this.speed + " C: " + this.color;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		 return o.price-this.price;// rank
		// return this.speed - o.speed;
		//return this.color.compareTo(o.color);
		// return 0;
	}
}
