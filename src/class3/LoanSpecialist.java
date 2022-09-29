package class3;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the loan amount needed?");
		
		int loan=scanner.nextInt();
		if (loan<=200000) {
			System.out.println("Will lend the money");
		}
		else {
			System.out.println("Will reject client");
		}
	}

}
