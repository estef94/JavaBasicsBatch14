package JavaClass6;

import java.util.Scanner;

public class EnhancedCode2 {



	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=input.next();
        String seasonOfBirth;
        
        if(month.equals("March") || month.equals("April") ||month.equals("May")) {
            seasonOfBirth= "Spring";
        }else if(month.equals("June") || month.equals("July") || month.equals("August")) {
            seasonOfBirth= "Summer";
        }else if(month.equals("September") || month.equals("October") || month.equals("November")) {
             seasonOfBirth= "Autumn";
        }else if(month.equals("December") || month.equals("January") || month.equals("February")) {
             seasonOfBirth= "Winter";
        }else {
             seasonOfBirth= "Invalid month";
        }

        System.out.println(seasonOfBirth); 
	}

}