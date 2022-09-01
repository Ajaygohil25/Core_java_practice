package Module_2;

import java.util.ArrayList;
// a1.ensureCapacity() method for increase size of list
public class Module_2_58_increaseSizeofList 
{
	public static void main(String[] args) 
	{
		ArrayList <String> a1 = new ArrayList<String>(4);
		a1.add("java");
		a1.add("javascript");
		a1.add("php");
		a1.add("python");
		System.out.println("array list is : "+a1);
		a1.ensureCapacity(6);
		a1.add("html");
		a1.add("css");
		System.out.println("array list after increase size is : "+a1);
		
	}
}
