package Class14;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		
		String motherName="Mary";
		String fatherName="Daniel";
		boolean isBoy=true;
		String firstHalf;
		String secondHalf;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the name of mother");
		motherName=scanner.next();
		System.out.println("Please Enter the name of father");
		fatherName=scanner.next();
		System.out.println("Are you expecting a boy or girl");
		isBoy=scanner.nextBoolean();
		
		if(isBoy) {
			firstHalf=fatherName.substring(0,fatherName.length()/2);
			secondHalf=motherName.substring(motherName.length()/2);
			System.out.println(firstHalf+secondHalf);
		}else {
			firstHalf=motherName.substring(0,motherName.length()/2);
			secondHalf=fatherName.substring(fatherName.length()/2);
			System.out.println(firstHalf+secondHalf);
		}
		System.out.println(firstHalf+secondHalf);
	}

}
