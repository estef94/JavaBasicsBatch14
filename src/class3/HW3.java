package class3;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a diploma");
		boolean diploma=scanner.nextBoolean();
		
		if(diploma) {
		System.out.println("Congratulations!");
		
		System.out.println("What is your GPA score");
		double GPA=scanner.nextDouble();
		
		if (GPA>=3.5) {
			System.out.println("You are eligible for scholarchip");
		}
		else {
			System.out.println("you should have studied harder");
		}
		}
		else {
			System.out.println("Get a degree");
		}
	}

}
