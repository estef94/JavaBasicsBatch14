package JavaClass7;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time= 10;
		
		if (time < 12) {
			
			System.out.println("good morning inside if statement");
		}
		
		/* infinite loop
		 *
		 * while (time < 12) {
		 * 
		 * System.out.println("good morning"); }
		 */
		
		 while (time < 12) {
			System.out.println("good morning inside while loop");
			time++;
		}
	}
}

