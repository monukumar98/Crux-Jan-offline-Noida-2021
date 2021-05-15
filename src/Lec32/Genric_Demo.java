package Lec32;

import java.util.Arrays;

public class Genric_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arri[]= {1,2,3,4,5};
//		System.out.println(Arrays.toString(arri));
//		display(arri);
//		String [] arrs= {"Hello","hey","bye","hii"};
//		display(arrs);
		Car[] cars = new Car[5];
		// display(cars);
//        Car cc = new Car();
//        cc.toString();
		
		cars[0] = new Car(3450, 30, "Yellow");
		cars[1] = new Car(1000, 120, "Black");
		cars[2] = new Car(2000, 100, "White");
		cars[3] = new Car(8907, 60, "Red");
		cars[4] = new Car(3400, 89, "Grey");
		display(cars);
		Bubble_Sort(cars);
		System.out.println(">>>>>>>>>>>>");
		display(cars);

	}

	public static <T> void display(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static <T extends Car> void Bubble_Sort(T [] arr) {

		for (int pass = 1; pass < arr.length; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if ((arr[j].compareTo(arr[j+1]))>0) {
					T t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;

				}

			}

		}
	}

}
