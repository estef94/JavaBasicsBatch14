package StudyGroup;

import java.util.Scanner;

public class ScannerClassPrimitive {

	 public static void main(String[] args) {

	        System.out.println("Enter height in inches: ");
	        Scanner scanner = new Scanner(System.in); 
	        // scanner can be named whatever, just has to have the same name underneath
	        // "height= whatever name is listed above"
	        //boolean, char, double, int

			double height = scanner.nextDouble();
			// if using String, change to .nextLine
			// String doesn't take = it takes .equals
			// in String, always has to be in " "

			if (height <= 60) {
				System.out.println("Short");

			} else if (height >= 60 && height <= 72) {
				System.out.println("Medium");

			} else if (height >= 72) {
				System.out.println("Tall");
			}
		}
	}
