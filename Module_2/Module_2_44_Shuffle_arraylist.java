package Module_2;

import java.util.ArrayList;
import java.util.Collections;
// collection.shuffle() for array list element
public class Module_2_44_Shuffle_arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("russia");
		a.add("canada");
		a.add("india");
		a.add("peris");
		a.add("china");
		System.out.println("Arraylist is : "+a);
		Collections.shuffle(a);
		System.out.println("arraylist after Shuffle : "+a);
		
		Collections.shuffle(a);
		System.out.println("arraylist after Shuffle : "+a);
		
	}
}
