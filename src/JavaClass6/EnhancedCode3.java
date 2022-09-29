package JavaClass6;

import java.util.Scanner;

public class EnhancedCode3 {

	public static void main(String[] args) {

			Scanner input=new Scanner(System.in);
	        System.out.println("Enter your score for quiz");
	        double quiz=input.nextDouble();
	        System.out.println("Enter your score for midterm");
	        double midterm=input.nextDouble();
	        System.out.println("Enter your score for final exam");
	        double finalexam=input.nextDouble();
	        double average=(quiz+midterm+finalexam)/3;
	        String grade;
	        if(average>=90 && average<=100) {
	        	grade="A";
	        } else if(average>=70 && average<90) {
	        	grade="B";
	        } else if(average>=50 && average<70) {
	        	grade="C";
	        } else if(average<50) {
	        	grade="F";
	        } else {
	        	System.out.println("Please enter valid score!");
	        	grade= "None";
	        }
	        
	        System.out.println("Grade: "+grade);


	}

}
