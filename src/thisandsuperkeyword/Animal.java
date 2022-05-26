package thisandsuperkeyword;

//super() for constructor;
//this(name) for constructor;

//this.m2() call method
//this.age call variables

public class Animal {
	private String name;
	private String color;
	private int age;
	public String sName;

	public Animal() {
		super();
	}

	public Animal(int age) {
		super();
		this.age = age;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}

	public Animal(String name, String color, int age) {
		this(name, age);
//		this.name = name;
//		this.color = color;
		this.color = color;
	}
//	public Animal(String name, String color, int age) {
//		super();
//		this.name = name;
//		this.color = color;
//		this.age = age;
//	}

//	public Animal(String color) {
//		super();
//		this.color = color;
//	}
	
	
	public void m1() {
		this.m2();
	}
	public void m2() {
		System.out.println("I love you Kitty...");
	}

}
