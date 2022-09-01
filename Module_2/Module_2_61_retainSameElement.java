package Module_2;

import java.util.HashSet;

public class Module_2_61_retainSameElement
{
	public static void main(String[] args) 
	{
		HashSet<String> h1 = new HashSet<String>();
		h1.add("java");
		h1.add("javascript");
		h1.add("php");
		h1.add("python");
		System.out.println(" 1st hashset is : "+h1);
		HashSet<String> h2 = new HashSet<String>();
		h2.add("html");
		h2.add("css");
		h2.add("php");
		h2.add("python");
		System.out.println(" 2nd hashset  is : "+h2);
		
		h1.retainAll(h2); // this method retain all same element into a1 arraylist 
		System.out.println(" Retain element is : "+h1);
	}
}
