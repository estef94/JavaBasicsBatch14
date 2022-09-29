package StudyGroup;

import java.util.Scanner;

public class SwitchDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number");
        int num2 = input.nextInt();
        System.out.println("Please enter an operator");
        char operation = input.next().charAt(0);

        	
        //stepani has a bf btw 
        int result = 0;
        switch(operation) {

        case '+':
        	result = (num1+num2);
            break;
        case '-':
            result=(num1-num2);
            break;
        case '*':
            result=(num1*num2);
            break;
        case '/':
            result=(num1/num2);
            break;
        default:
            System.out.println("Wrong operation");
        }
       
        if( operation == '+' ||  operation == '-' || operation == '*' || operation == '/') {
        	System.out.println(result);
        	
        
    }

    
	}

}
