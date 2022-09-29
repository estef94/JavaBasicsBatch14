package JavaClass7;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print all numbers from 1 to 10
		
		int num=1;
		
		while(num<=10) {
			
			System.out.print(num+" ");
			num++;
		}
		
		System.out.println("------------------------------");
		
		// print all numbers from 10 to 25
		
		int a=10;
		
		while(a<=25) {
			
			System.out.print(a +" ");
			a++;
		}
		
		System.out.println("----------------------------------");
		
		// print all numbers from 10 to 1
		
		int b=10;
		
		while(b>=1) {
			
			System.out.print(b+ " ");
			b--;
			
		}
		
		// print all numbers from 50 to 20
		
		// print all even numbers from 1 to 20
	
	
		int c=2;
		
		while (c<=20) {
			System.out.print(c+ " "); //2
			c +=2; // c=c+2=4
		}
		
		System.out.println("Another way");
		
		int d=2;
	
			while(d <= 20) {
			
				if (d % 2 == 0) {
				System.out.print(d +" ");
			}	
				
				d++;
			
			System.out.println("I am inside while loop");
	}
  }
}