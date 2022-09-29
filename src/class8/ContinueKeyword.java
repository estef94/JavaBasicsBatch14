package class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<5; i++) {
			
			if (i==3) {
				
			continue; 
		}
		
		System.out.println("Hello");
		System.out.println("How are you");
		System.out.println(i);
		
	}
		
		// I want to print numbers from 1 to 20 except numbers 6, 7 and 8
		
		for(int i=1; i<=20; i++) {
			
			if(i==6 || i==7 || i==8) {
				continue;
		}
			System.out.println(i+ " ");
		}
		
		//continue - continues to the next iteration/cycle
		//moment Java sees continue -> it goes back to the beginning 
		//it usually used inside some type of conditions
		
	}
}
