package class3;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("What city do you live in?");
		
		String city=scanner.nextLine();
		
		System.out.println("What is the temperature in your city?");
		int Temperature=scanner.nextInt();
		
		Temperature=(Temperature-32)*5/7;
		System.out.println("The temperature in the city of " +city + " is " + Temperature+"C");
	}

}
