package Module_2;
//endsWith () method 

public class Module_2_4_end_string
{
	public static void main(String[] args)
	{
		String str1 = "Java exersise";
		String str2 = "Java exersises";
		String end_str = "se";
		// -->   \" \" use this for " " --> double quotes in  statement 
		System.out.println("compare \"" +str1+ "\" with \""+end_str+ "\" Result is : "+str1.endsWith(end_str));
		System.out.println("compare \"" +str2+ "\" with \""+end_str+ "\" Result is : "+str2.endsWith(end_str));
	}
}
