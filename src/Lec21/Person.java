package Lec21;

public class Person {
	String name;
	int age;

	public void introduceYourself() {

		System.out.println(name + " is " + age + " years old");
	}

	public void sayHi(String name) {
		System.out.println(this.name + " says hii to " + name);
	}

}
