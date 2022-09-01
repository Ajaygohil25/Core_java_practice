package Module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Module_2_35_iterateArraylist
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("java");
		a1.add("python");
		a1.add("c++");
		a1.add("c");
		System.out.println("collection of arrayList : "+a1);
		Iterator i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println("collection item is : "+i1.next());
		}
	}
}
