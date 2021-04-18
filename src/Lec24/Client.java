package Lec24;

public class Client {
	public static void main(String[] args) {
		// P obj = new P();
		// C obj1 = new C();
		// Case 1
		System.out.println(".......case 1...........");
		P obj = new P();
		System.out.println(obj.d);// 1
		System.out.println(obj.d1);// 100
		// System.out.println(obj.d2);
		obj.fun();// p
		obj.fun1();// p
		// Case 2
		System.out.println(".......case 2...........");
		P obj1 = new C();// obj1 -->Parent  instance child --> (new C())
		System.out.println(obj1.d);// 1
		System.out.println(((C) (obj1)).d);// 2
		System.out.println(obj1.d1);// 100
		System.out.println(((C) (obj1)).d2);// 200
		obj1.fun();// c
		((C) obj1).fun2();// c
		obj1.fun1();// p
		// Case 3
//		System.out.println(".......case 3...........");
//		C obj2 = new P();
//		System.out.println(obj2.d);
//		System.out.println(obj2.d1);
//		System.out.println(obj2.d2);
//		obj2.fun();
//		obj2.fun1();
//		obj2.fun2();
		// Case 3
		System.out.println(".......case 4...........");
		C obj3 = new C();
		System.out.println(obj3.d);//2
		System.out.println(((P)(obj3)).d);//1
		System.out.println(obj3.d1);//100
		System.out.println(obj3.d2);//200
		obj3.fun();//C
		obj3.fun1();//P
		obj3.fun2();//C

	}
}
