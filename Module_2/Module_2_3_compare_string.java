package Module_2;

// contentEquals() method 
public class Module_2_3_compare_string {
	public static void main(String[] args) {
		String str1 = "topsint.com";
		String str2 = "Topsint.com";
		CharSequence cs = "topsint.com";
		
		System.out.println("comparing "+str1+ " and "+cs+" Result is : "+str1.contentEquals(cs));
		
		System.out.println("comparing "+str2+ " and "+cs+" Result is : "+str2.contentEquals(cs));
	}
}
