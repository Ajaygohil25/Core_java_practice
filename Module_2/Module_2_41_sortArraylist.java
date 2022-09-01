package Module_2;

import java.util.ArrayList;
import java.util.Collections;


public class Module_2_41_sortArraylist 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("russia");
		a.add("canada");
		a.add("india");
		a.add("peris");
		a.add("china");
		System.out.println("arraylist collection is : "+a);
		Collections.sort(a); // sort method for sorting arraylist 
		System.out.println("sorted arraylist is : "+a);
	}
}
