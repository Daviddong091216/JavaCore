package finalkeyword;

import java.util.ArrayList;
import java.util.List;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyWord f1= new FinalKeyWord("Kitty");
		System.out.println(f1.group1);
		System.out.println(f1.display(10));
		f1.display();
		
		
		final List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        
        System.out.println(myList);
        
        List tmp = new ArrayList();
        tmp.add("four");
        
//        myList = tmp;The final local variable myList cannot be assigned”
		
	}

}
