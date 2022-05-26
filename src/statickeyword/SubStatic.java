package statickeyword;

public class SubStatic extends StaticKeyWord {

//	you cannot override a static method in Java as there will not be any Run-time Polymorphism happening.
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public SubStatic(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

}
