package Lec33;

import java.util.Comparator;

import Lec32.Car;

public class CarPriceComprator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o2.price-o1.price;
	}

}
