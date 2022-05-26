package abstractkeyword;

//There are mainly two differences between an abstract class and concrete class. They are:
//a)We cannot create an object of abstract class. Only objects of its non-abstract (or concrete) sub classes can be created.
//
//b) It can have zero or more abstract methods that are not allowed in a non-abstract class (concrete class).

public abstract class A {
//	Abstract is a non-access modifier in java that is applicable for classes, interfaces, methods, and inner classes.

//	Can abstract modifier applicable for variables?
//
//			Ans: No.
//	public abstract String name1;

//	public abstract void m1() {
//		
//	}
	
	
//	A method which is declared with abstract modifier and has no implementation (means no body) is called abstract method in java.
	public abstract void m2();
	
//	abstract method overloading
	public abstract int m2(int num);
	
//	Can an abstract method be declared as static?
//
//			Ans: No.
//	public static abstract void m3();
	
	
//	Can an abstract method be declared with private modifier?
//
//			Ans: No, it cannot be private because the abstract method must be implemented in the child class. 
//			If we declare it as private, we cannot implement it from outside the class.
//	private abstract void m4();
	
	
//	Is it possible that an abstract class can have without any abstract method?
//
//			Ans: Yes
	
//	we cannot define an abstract method in non-abstract class.
	//an abstract class can have a non-abstract method
	
	public void mm1() {
		System.out.println("I love you....");
	}

}
