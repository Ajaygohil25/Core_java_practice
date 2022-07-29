package Module_2;
// the same name but different sequence of the integer and the character parameters

class printIC
{
	void printIntchar(int rollnum, char stream)
	{
		System.out.println("stream is : "+ stream + " and Roll number is :" + rollnum);
	}
	void printIntchar(char div, int class_num)
	{
		System.out.println("Division is : "+ div + " and Class number is : "+ class_num);
	}
}
public class Module_2_7 {
	public static void main(String[] args) {
		printIC  p =new printIC();
		p.printIntchar(1, 'a');
		p.printIntchar('b', 20);
	}

}
