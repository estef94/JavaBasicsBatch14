package JavaClass9;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] iceCream= {"vanilla", "chocolate", "pistashio", "kulfi"};
		
		System.out.println(iceCream[0]);
		System.out.println(iceCream[1]);
		
		//how to get all values?
		
		for(int i=0; i<iceCream.length; i++) {
			
			System.out.println(iceCream[i]);
		}
		
		System.out.println("-------------------------------------------");
		
		char[] letters= {'A', 'B', 'C', 'D'};
				
			for(int i=0; i<letters.length; i++) {
				
				System.out.print(letters[i]+" ");
			}
				
	}

}