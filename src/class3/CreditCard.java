package class3;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		
		String hasCreditCard=Scanner.nextLine();
		boolean hasNoCreditCard=false;
		
		if(hasNoCreditCard) {
			System.out.println("Would you like to apply for a credit card?");
		}
		else {
		System.out.println("What is the balance on your card?");
		}
		String balance=Scanner.nextLine();
		int balanceAmount=1000;
		
		if(balanceAmount>=
				1000) {
			System.out.println("Pay off your balance immediately");
		}
		else {
			System.out.println("Spend more money");
		}
	}
	
}
