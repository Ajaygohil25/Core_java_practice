package Module_2;

import java.util.ArrayList;
// arraylist.get() // get() method for get element using index of it 
public class Module_2_60_printUsingPosition
{
	public static void main(String[] args) 
	{
		ArrayList <String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("javascript");
		a1.add("php");
		a1.add("python");
		System.out.println("array list is : "+a1);
		
		System.out.println("print all element using position of element  : ");
		for (int i=0;  i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
	}
}
