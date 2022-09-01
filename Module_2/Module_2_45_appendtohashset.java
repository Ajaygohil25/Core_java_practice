package Module_2;

import java.util.HashSet;

public class Module_2_45_appendtohashset 
{
	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add("java");
		h1.add("c++");
		h1.add("c");
		h1.add("php");
		System.out.println("hash set is : "+h1);
		h1.add("ph");
		System.out.println("hash set is : "+h1);
		
	}

}
