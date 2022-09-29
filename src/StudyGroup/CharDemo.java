package StudyGroup;

import java.util.Scanner;

public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner= new Scanner(System.in);
	        System.out.println("Please enter the first number ");
	        int num1=scanner.nextInt();
	        System.out.println("Please enter the second number");
	        int num2=scanner.nextInt();
	        System.out.println("Please choose the operation");
	        char operation=scanner.next().charAt(0);
	        int sum=num1+num2;
	        int difference=num1-num2;
	        int product=num1*num2;
	        double quotient=num1/num2;

	        if(operation=='+') {
	            System.out.println("The sum of the numbers is " +sum);
	        }
	        else if(operation=='-') {
	            System.out.println("The difference of the numbers is " +difference);
	        }
	        else if(operation=='*') {
	            System.out.println("The product of the numbers is " +product);
	        }
	        else if(operation=='/') {
	            System.out.println("The quotient of the numbers is " +quotient);
	        }
	        else {
	            System.out.println("Wrong operation");
	        }
	    }

}	
	


