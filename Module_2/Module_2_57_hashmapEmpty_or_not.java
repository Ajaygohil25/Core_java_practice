package Module_2;

import java.util.HashMap;
// isEmpty() method for check map is empty or not 
public class Module_2_57_hashmapEmpty_or_not 
{
	public static void main(String[] args)
	{
		HashMap h1= new HashMap();
		h1.put(1, "java");
		h1.put(2, "c++");
		h1.put(3, "c");
		h1.put(4, "php");
		System.out.println(h1);
		
		boolean result;
		result  = h1.isEmpty();
		System.out.println("hashmap  empty or not  : "+result);
		h1.clear();
		result = h1.isEmpty();
		System.out.println("hashmap  empty or not  : "+result);
		
	}
}
