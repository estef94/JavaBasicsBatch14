package class8;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Prompt the user to ask the name 3 times and print "Good afternoon +name"
		 */
		
		Scanner input=new Scanner(System.in);
		
		for (int i=1; i<=3; i++) {
			
			System.out.println("Please write a name");
			String name=input.nextLine();
			System.out.println("Good afternnon " +name);
			
			System.out.println("--------------------------------------");
			
			
		}
	}

}
