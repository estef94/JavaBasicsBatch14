package JavaClass7;

import java.util.Scanner;

public class Calculator {

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
        boolean wrongOperator=false;

        if (op == '+') {
            result= num1 + num2;
        } else if (op == '-') {
            result= num1 - num2;
        } else if (op == '*') {
            result= num1*num2;
        } else if (op == '/') {
            result= num1 / num2;
        } else {
            System.out.println("enter valid operator");
            wrongOperator=true;
        }
          if (result !=0.0 && wrongOperator) {
        	  System.out.println(result);
          }
        
        System.out.println("--------------------");

	}
}	