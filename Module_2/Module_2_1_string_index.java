package Module_2;

import java.util.Scanner;
// CharAt() method 
public class Module_2_1_string_index {
	public static void main(String[] args) {
		String str = "Tops Technologies !";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index no : ");
		int inum = sc.nextInt();

		if (inum <= 19)	
		{
			System.out.println("Character at given index is : "+ str.charAt(inum));
		}
		else
		{
			System.out.println("please enter index number in range 0 to  !!");
		}
		sc.close();
		
	}

}
