package statickeyword;

public class StaticDemo {

	public static void main(String[] args) {
//		System.out.println(StaticKeyWord.color);
		System.out.println(StaticKeyWord.color1);
		System.out.println(StaticKeyWord.display1(10));
		StaticKeyWord.display1();
		
		StaticKeyWord s1= new StaticKeyWord("White");//	public static int num=1/0;// when the class is initialized, a run exception will throw
		System.out.println(s1.getColor());
//		System.out.println(s1.color);
		System.out.println(s1.group);
		System.out.println(s1.getGroup());
		System.out.println(StaticKeyWord.group);// We can call a static variable without without creating an object of class
		System.out.println(StaticKeyWord.getGroup());// We can call a static variable without without creating an object of class
		StaticKeyWord.display1();// We can call a static method without without creating an object of class
//		StaticKeyWord.display2();// We can NOT call a non-static method without without creating an object of class
		s1.display2();
//		StaticKeyWord.display3();//an exception will throw when run it.
		
		
//		System.out.println(SubStatic.add(1,2));
		SubStatic sb1= new SubStatic("Black");
		System.out.println(sb1.add(1,2));
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
