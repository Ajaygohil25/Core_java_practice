package Module_2;

import java.util.ArrayList;

public class Module_2_39_RemoveElement
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("russia");
		a.add("canada");
		a.add("india");
		a.add("peris");
		a.add("china");
		System.out.println("arraylist collection is : "+a);
		a.remove(3);
		System.out.println("collection after remove third index element : "+a);
	}
}
