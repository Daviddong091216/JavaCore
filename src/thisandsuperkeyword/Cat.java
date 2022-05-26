package thisandsuperkeyword;

public class Cat extends Animal{
	
	public String sname;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String color, int age) {
		super(name, color, age);
		// TODO Auto-generated constructor stub
	}

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	public void sm1() {
		super.m1();
	}
	public void sm2() {
		System.out.println(super.sName);
	}

}
