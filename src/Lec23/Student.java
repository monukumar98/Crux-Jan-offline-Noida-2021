package Lec23;

public class Student {
	public  String name;
	protected int age;
static int ii=9;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("age -ve hai ");
		}
		this.age = age;
	}
static {
	System.out.println("Hey im in Static ");
}
	public void setAge1(int age) {
		try {
			if (age < 0) {
				throw new Exception(" Age negative ");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}
		
		finally {
			System.out.println("hey im  in final");
		}
		System.out.println("hello");
	}

}
