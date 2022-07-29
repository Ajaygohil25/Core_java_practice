package Module_2;
// startsWith() --> method 
public class Module_2_5_starting_string {
	public static void main(String[] args) {
		String str1 ="Red is favourite color";
		String str2 ="Orange is favourite color";
		String str = "Red";
		System.out.println("Comparing \""+str1+"\" with \""+str+"\" result is : "+str1.startsWith(str));
		System.out.println("Comparing \""+str2+"\" with \""+str+"\" result is : "+str2.startsWith(str));
	}
}
