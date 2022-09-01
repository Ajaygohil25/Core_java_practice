package Module_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
 // collection.copy(arr1,arr2);
public class Module_2_43_copy_arraylist
{
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("russia");
		a.add("canada");
		a.add("india");
		a.add("peris");
		a.add("china");
		ArrayList<String> b=  new ArrayList<String>();
		b.add("1");
		b.add("2");
		b.add("3");
		b.add("4");
		b.add("5");
		System.out.println("two arraylist collection is : "+a +"\n"+b);
		// copy arraylist
		Collections.copy(b, a);
		System.out.println("after copy arraylist collection is : "+a+ "\n"+b);
	}
}
