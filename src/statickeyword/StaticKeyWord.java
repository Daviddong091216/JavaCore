package statickeyword;

//In the Java programming language, the keyword static means that the particular member belongs to a type itself, 
//rather than to an instance of that type. 
//This means we'll create only one instance of that static member that is shared across all instances of the class.

//
//In Java, static keyword is mainly used for memory management. It can be used with variables, methods, blocks and nested classes. 
//It is a keyword which is used to share the same variable or method of a given class. 
//Basically, static is used for a constant variable or a method that is same for every instance of a class.

//public static class SaticKeyWord {
//You cannot use the static keyword with a class unless it is an inner class.
//A static inner class is a nested class which is a static member of the outer class.
public class StaticKeyWord {
	private String name;
	private static String color;// static for field/variable
	public static String color1;// static for field/variable
	public static String group = "UMSL";// static for field/variable
//	public static int num=1/0;// when the class is initialized, a run exception will throw
	public static int num2 = 100;

	public StaticKeyWord(String color) {// the static variables can be assigned value in a constructor
		super();
		this.color1 = color;
	}
	
	
//	In general, a static method means that “The Method belongs to the class and not to any particular object” 
//	but a constructor is always invoked with respect to an object,
//	so it makes no sense for a constructor to be static.
//	public static StaticKeyWord(String color) {
//		super();
//		this.color1 = color;
//	}
	
	
//	public SaticKeyWord(String name) {
//		super();
//		this.name = name;
//	}

	
	
	
	
	public static void display1() {
//		System.out.println("It is:  " + color + group+ name);
//		Can not call a non-static variable "name" in a static method
		System.out.println("Static method:  " + color + group);
	}

	
	public void display2() {
		System.out.println("No-static method:" + color + group + name);
//		we can call static variables in a non-static method
	}

//	we can overload a static method 
	public static int display1(int num) {
		return num * 2;
	}

	public static int display3() {
		return 1 / 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		StaticKeyWord.color = color;
	}

	public static String getGroup() {
		return group;
	}

	public static void setGroup(String group) {
		StaticKeyWord.group = group;
	}

	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

}