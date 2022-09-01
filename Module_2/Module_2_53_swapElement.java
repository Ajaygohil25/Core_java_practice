package Module_2;

import java.util.ArrayList;
import java.util.Collections;
// collection.swap(arraylist_name, index 1 ,index 2) for swap element 
public class Module_2_53_swapElement 
{
	public static void main(String[] args) 
	{
		ArrayList <String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("javascript");
		a1.add("php");
		a1.add("python");
		System.out.println("array list is : "+a1);
		Collections.swap(a1, 0, 3);
		System.out.println("Arraylist after swaping : "+a1);
		
	}
}
