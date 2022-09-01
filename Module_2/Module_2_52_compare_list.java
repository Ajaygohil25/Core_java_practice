package Module_2;

import java.util.ArrayList;
// arraylist.compare()  method 

public class Module_2_52_compare_list 
{
	public static void main(String[] args)
	{
		ArrayList <String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("javascript");
		a1.add("php");
		a1.add("python");
		System.out.println("1St array list is : "+a1);
		ArrayList <String> a2 = new ArrayList<String>();
		a2.add("java");
		a2.add("javascript");
		a2.add("php");
		a2.add("c++");
		System.out.println("2nd array list is : "+a2);
		
		ArrayList <String> a3 = new ArrayList<String>();
		for (String e: a1)
		{
			a3.add(a2.contains(e) ? "yes" : "no");
		} 
		System.out.println("comparing two arraylist "+a3);
		
	}
}
