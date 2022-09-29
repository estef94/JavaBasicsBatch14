package JavaClass7;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aaa = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        double num1 = aaa.nextInt();
        System.out.println("Enter 2nd Number");
        double num2 = aaa.nextInt();
        System.out.println("Enter the operator");
        String oper=aaa.nextLine();
        char op = aaa.next().charAt(0);
        double result=0 ;
        
        switch (op) {

        case '+':
            result = (num1 + num2);
            break;
        case '-':
            result = (num1 - num2);
            break;
        case '*':
            result = (num1*num2);
            break;
        case '/':
            result = (num1 / num2);
            break;

        default:

            break;

        }
        if((op=='/') || (op=='*') || (op=='+') ||(op=='-')) {
            System.out.println("The Result is: "+result);
        }
        else
        System.out.println("Enter valid operator");	
		
	}

}
