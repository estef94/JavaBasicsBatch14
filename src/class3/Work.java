package class3;

import java.util.Scanner;

public class Work {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many years employed with this company?");
		int years=scanner.nextInt();
		
		if (years>=5) {
		System.out.println("You are eligible for a bonus");
		
		System.out.println("What is your annual salary?");
		int Salary=scanner.nextInt();
		
		if (Salary>50000) {
			System.out.println("You get bonus of $5000");
		}
		else {
			System.out.println("You get bonus of $3000");
		}
		}
		else {
			System.out.println("You are not eligible for the bonus");
		}
	}

}	
			
	
