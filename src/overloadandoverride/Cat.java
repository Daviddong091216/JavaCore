package overloadandoverride;

//Modifying a super class method in the sub class is called method overriding. Using method overriding, 

//we can change super class method according to the requirements of sub class.

public class Cat extends Animal {

	public Cat(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	// methods overriding
	@Override
//	public static int m1(int n1, int n2) {//You can’t override non-static methods as static.
	public int m1(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int m1(int n1) {
		return n1;
	}

//	If we change the arguments of overriding method, then that method will be treated as overloaded not overridden.
	public static int m1(String n1) {
		return 10;
	}

//	You must not reduce the visibility of a method while overriding.
//	@Override
//	 int m1(int n1) {
//		return n1;
//	}
}
