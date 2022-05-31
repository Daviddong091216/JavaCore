package thisandsuperkeyword;

//Super keyword in java is a reference variable which is refers immediate parent or super class object. 
//In other words, Super keyword is used to access the members of parent class.



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

//	Can we use both "this" and "super" in constructor?
//			No, It is not possible in java we cannot use both this and super keyword together in java constructor 
//			because this and super should be the first statement in any java constructor.
	
	
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
