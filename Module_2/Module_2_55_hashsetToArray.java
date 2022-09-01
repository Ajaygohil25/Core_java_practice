package Module_2;

import java.util.HashSet;

public class Module_2_55_hashsetToArray 
{
	public static void main(String[] args)
	{
		HashSet h1 = new HashSet();
		h1.add("java");
		h1.add("php");
		h1.add("python");
		h1.add("c#");
		System.out.println("hash set is  : "+h1);
		String [] ar_1 = new String [h1.size()];
		
		h1.toArray(ar_1);
		
		for(int i=0; i<h1.size() ;  i++)
		{
			 System.out.println("element into array : " +ar_1[i]);
		}
		
	}
}
