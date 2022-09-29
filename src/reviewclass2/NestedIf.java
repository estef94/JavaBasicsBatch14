package reviewclass2;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * Nested if conditions are conditions which are dependent on each other if outer condition
		 * is not true inner-condition is never checked inner-conditions are only checked when
		 * outer-condition is passed
		 */
		
		int money=10;
		if(money>10) {
			System.out.println("Lets buy some eggs");
			int noOfEggs=2;
			
			if(noOfEggs>0) {
				System.out.println("lets boil the eggs");
			}
		}

	}

}
