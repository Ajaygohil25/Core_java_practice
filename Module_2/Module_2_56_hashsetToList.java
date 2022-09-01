package Module_2;

import java.util.ArrayList;
import java.util.HashSet;

public class Module_2_56_hashsetToList 
{
	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add("java");
		h1.add("php");
		h1.add("python");
		h1.add("c#");
		System.out.println("hash set is  : "+h1);
		
		ArrayList a1 = new ArrayList(h1);
		
		System.out.println("arraylist is : "+a1);
	}
}
