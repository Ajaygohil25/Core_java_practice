package Module_2;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to extract a portion of an array list.
// portion of array list means divide into sub arraylist 
// arraylist.sublist() method 
public class Module_2_51_portion_arraylist 
{
	public static void main(String[] args)
	{
		
	
		ArrayList <String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("javascript");
		a1.add("php");
		a1.add("python");
		System.out.println("array list is : "+a1);
		//ArrayList<String>  a2 = a1.subList(0, 1); // convert into sublist from a1's index 0 to 2
		
		//System.out.println("sub arraylist : "+a2);
	}
}
