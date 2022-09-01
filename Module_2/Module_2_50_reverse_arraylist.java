package Module_2;

import java.util.ArrayList;
import java.util.Collections;
// collection.reverse(arralist_name) method 
public class Module_2_50_reverse_arraylist 
{
	public static void main(String[] args)
	{
		ArrayList <String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("javascript");
		a1.add("php");
		a1.add("python");
		System.out.println("array list is : "+a1);
		Collections.reverse(a1);
		System.out.println("reverse array list is : "+a1);
	}
}
