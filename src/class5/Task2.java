package class5;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day”
		 * 
		 */
		
		int day =7;
        if (day >= 1 && day <= 5) {
            System.out.println("This is weekday");
        } else if (day >=6 && day <= 7) {
            System.out.println("It is weekend"); }
            else {
                System.out.println("Invalid");
        }
        
        System.out.println("----------");
        
        if (day >= 1 && day <= 5) {
            System.out.println("It is weekday");
        }else if (day == 6 || day == 7) {
            System.out.println("it is weekend");
        }else {
            System.out.println("Invalid day");
        }
	}

}
