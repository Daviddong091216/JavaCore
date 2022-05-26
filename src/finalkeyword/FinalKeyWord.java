package finalkeyword;

//The final variable is a variable whose value cannot be changed at any time once assigned, it remains as a constant forever.
//The final method cannot be overridden
//A final class cannot be subclassed (cannot be extended)

//Final keyword can be applied to class, block, method and variables


public class FinalKeyWord {

	//	A blank final variable is a final variable, which is not initialized during declaration
	final String group1;//A constructor also can be used to initialize a blank final variable.
	final static String group2;//Through Static Initialization Block
	final String group3;//Through Instance Initialization Block (IIB)
	{group3="KKKK";}
//	final String group4;
//	final String group5;
//	final String group6;
	
	final String group7="UMSL";
	
//	group1="kkk";
	
//	The static block is a block of code inside a Java class, which will be executed when a class is first loaded into the JVM. 
//	The Static Initialization Block can be used to initialize a class final variable/static final variable
	static {
		group2="Lovely";
	}
	
//	A constructor also can be used to initialize a blank final variable.
	public FinalKeyWord(String group1) {
		super();
		this.group1 = group1;
	}
	
	

//	 Constructor cannot be declared as final. Constructors are not inherited and so it cannot be overridden, 
//	 so there is no use to have a final constructor.
//
//	 You will get an error like “Illegal modifier for the constructor in type Test; only public, protected & private are permitted”

//	public final FinalKeyWord(String group1, String group3, String group4, String group5, String group6) {
//	super();
//	this.group1 = group1;
//	this.group3 = group3;
//	this.group4 = group4;
//	this.group5 = group5;
//	this.group6 = group6;
//}





	//The final method cannot be overridden
	public final void display() {
		System.out.println("I love you Kitty...");
	}
	
//	final method can be overloaded but cannot be overridden. 
//	Which means you can have more than one final method with the same name with different parameters.
	public final int display(int n) {
		return n;
	}
	
	

}
