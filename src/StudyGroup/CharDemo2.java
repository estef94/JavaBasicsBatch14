package StudyGroup;

import java.util.Scanner;

public class CharDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the first number ");

        double num1=scanner.nextDouble();
        System.out.println("Please enter the second number");

        double num2=scanner.nextDouble();
        System.out.println("Please choose the operation");
        char operation=scanner.next().charAt(0);

        if (operation=='+') {
            System.out.println(num1+num2);
        }else if (operation=='-') {
            System.out.println(num1-num2);
        }else if (operation=='*') {
            System.out.println(num1*num2);
        }else if (operation=='/') {
            System.out.println(num1/num2);
        }else {
            System.out.println("Wrong operation");
        }
   
	}

}
