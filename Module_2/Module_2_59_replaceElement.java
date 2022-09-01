package Module_2;

import java.util.ArrayList;
// arraylist.set(index no ,  value )  ==> method for replace specific element
public class Module_2_59_replaceElement 
{
	public static void main(String[] args) 
	{
		ArrayList <String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("javascript");
		a1.add("php");
		a1.add("python");
		System.out.println("array list is : "+a1);
	    a1.set(1, "mysql"); // replace 2nd element here 
	    System.out.println("array  list after replace element : "+a1);
	}
}
