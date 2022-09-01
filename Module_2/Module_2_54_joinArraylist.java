package Module_2;

import java.util.ArrayList;
// arraylistname.addAll(arraylist1); //.addAll() method for add all element in another arraylist
public class Module_2_54_joinArraylist 
{
	public static void main(String[] args) 
	{
		ArrayList <String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("javascript");
		a1.add("php");
		a1.add("python");
		System.out.println("array list is : "+a1);
		ArrayList <String> a2 = new ArrayList<String>();
		a2.add("html");
		a2.add("css");
		
		System.out.println("2nd array list is : "+a2);
		ArrayList <String> j = new ArrayList<String>();
		
		j.addAll(a1);
		j.addAll(a2);
		
		System.out.println("join arraylist is : "+j);
		
	}
}
