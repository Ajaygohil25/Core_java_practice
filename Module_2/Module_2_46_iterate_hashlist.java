package Module_2;

import java.util.HashSet;
import java.util.Iterator;

public class Module_2_46_iterate_hashlist
{
	public static void main(String[] args) 
	{
		HashSet<String > h1 = new HashSet<String>();
		h1.add("java");
		h1.add("c++");
		h1.add("c");
		h1.add("php");
		Iterator<String> i1 = h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
