package JavaClass6;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {

		Scanner scan= new Scanner (System.in);
		System.out.println("What is the time now? Use 24 hour format ");
		int time=scan.nextInt();
		
		String timeOfTheDay= null;
		
		if (time>=1 && time<=11) {
		    timeOfTheDay= "Morning";
		}else if (time>=12 && time<=15) {
		     timeOfTheDay= "Afternoon";
		}else if(time>=16 && time<=20) {
		     timeOfTheDay= "Evening";
		}else if (time>=21 && time<=24) {
		      timeOfTheDay= "Night";
		}else {
			System.out.println("Wrong number is entered");
			timeOfTheDay="Invalid";
		}
	System.out.println(timeOfTheDay);
	
	}

}
