
/*
Laba 2.1
*/

import java.util.Scanner;

public class Task1InfoScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("\tPlease fill in the data."); 
		System.out.print("Name:\t");
		String name = scanner.nextLine();
		System.out.print("Group:\t");
		String group = scanner.nextLine();
		System.out.print("Work:\t");
		String work = scanner.nextLine();
		System.out.print("Hobby:\t");
		String hobby = scanner.nextLine();

		System.out.println("\tYou specified the following data.");
		System.out.println("Name:\t" + name);
		System.out.println("Group:\t" + group);
		System.out.println("Work:\t" + work);
		System.out.println("Hobby:\t" + hobby);
	}
}

