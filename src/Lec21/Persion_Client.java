package Lec21;

import Lec1.Student;

public class Persion_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "kumal";
		p.age = 30;
		System.out.println(p.name);
		System.out.println(p.age);
		Person p1 = new Person();
		p1.name = "Hardik";
		p1.age = 25;
		System.out.println(p.name + " " + p.age);
		System.out.println(p1.name + " " + p1.age);
		System.out.println(".......................");
		//Test1(p, p1);
		System.out.println(p.name + " " + p.age);
		System.out.println(p1.name + " " + p1.age);
		//Test2(p, p1);
		int myAge=50;
		String myName="Monu";
		//Test3(p, p1.age, p1.name, myAge, myName);
		System.out.println("......test3...");
		System.out.println(p.name + " " + p.age);
		System.out.println(p1.name + " " + p1.age);
		System.out.println(myAge);
		System.out.println(myName);
		
		p.introduceYourself();
		p.sayHi("Vivo");

	}
	public static void Test3(Person s, int age, String name, int myAge, String myName) {
		s.age = 0;
		s.name = "_";
		age = 0;
		name = "_";
		myAge = 0;
		myName = "_";
	}
	public static void Test2(Person s2, Person s3) {

		s2 = new Person();
		int tempa = s2.age;
		s2.age = s3.age;
		s3.age = tempa;

		s3 = new Person();
		String tempn = s2.name;
		s2.name = s3.name;
		s3.name = tempn;
	}

	public static void Test1(Person s2, Person s3) {
		Person t = s2;
		s2 = s3;
		s3 = t;
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
	}

}
