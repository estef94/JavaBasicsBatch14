package StudyGroup;

import java.util.Scanner;

public class ScannerClassNonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.println("What is the weather outside?");

        String weather=scanner.nextLine();

        if(weather.equalsIgnoreCase("sunny")) {
            System.out.println("take a walk");

      }  else if (weather.equals("rainy")) {
                System.out.println("take a nap");

      }  else if (weather.equals("snowing")) {
            System.out.println("build a snowman");
        } else { 
            System.out.println("invalid answer");
        }

      }

}
