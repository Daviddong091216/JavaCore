package overloadandoverride;

//When a class has more than one method with same name but different parameters, then we call those methods are overloaded. 
//Overloaded methods will have same name but different number of arguments or different types of arguments.

public class Animal {
	private String name;
	private int age;
	private static String group;
	
//	constructor overloading
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Animal(String name) {
		super();
		this.name = name;
	}
	public Animal(int age) {
		super();
		this.age = age;
	}
	
	
// methods overloading
	public int m1(int n1, int n2) {
		return n1+n2;
	}
	public int m1(int n1) {
		return n1;
	}
	
//	Is it possible to have two methods in a class with same method signature but different return types?
//
//			No, compiler will give duplicate method error. Compiler checks only method signature for duplication not the return types. 
//					If two methods have same method signature, straight away it gives compile time error.	
	
//	public double m1(int n1, int n2) {
//		return n1+n2;
//	}
	
	
					
					
					

}
