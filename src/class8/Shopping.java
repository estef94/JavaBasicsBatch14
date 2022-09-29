package class8;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item=input.nextLine();
		
		System.out.println("What is the price of the item?");
		double price=input.nextDouble();
		
		double money;
		double total=0; 
		
			System.out.println("How much money do you havve");
			
		do {	money=input.nextDouble();
		
			total+=money; //accumulate all money
			double need;
			double change;
			
			if(money<price) {
				need=price-total;
				System.out.println("You need to pay more");
				
		} else if (total>price) {
			change=total-price;
			System.out.println("Here is your change "+change);
			
		}
			
		}while(total!=price);
		System.out.println("Thank you for shopping");
		}
	

}
