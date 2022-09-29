package JavaClass12;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many countries you want to process");
		int size=scanner.nextInt();
		
		// Two array one to store the countries and the other one to store the capital
		
		String [] countries=new String[size];
		String [] capitals=new String[size];
		
		// This is just to consume that extra enter that we will be getting from line number 18
		scanner.nextLine();
		
		for(int i=0;i<size;i++) {
			System.out.println("Please Enter the country name");
			countries[i]=scanner.nextLine();
			
			System.out.println("Please Enter the capital for "+countries[i]);
			capitals[i]=scanner.nextLine();
			
		}
		
		// Pints the arrays in a good format
		System.out.println(Arrays.toString(countries));
		System.out.println(Arrays.toString(capitals));
		
		for(int i=0;i<size;i++) {
			System.out.println("The country "+ countries[i]+" Has the capital "+capitals[i]);
					
		}
	}

}
