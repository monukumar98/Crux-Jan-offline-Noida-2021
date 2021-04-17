package Lec21;

public class Person {
	String name ;
	int age;

	public Person() {
		this.name = "Hey";
		this.age = 90;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void introduceYourself() {
		int rl = 90;
		System.out.println(this.name + " is " + age + " years old");
	  this.sayHi("Nope");
	}

	private void sayHi(String name) {
	
		System.out.println(this.name + " says hii to " + name);
	}

}
