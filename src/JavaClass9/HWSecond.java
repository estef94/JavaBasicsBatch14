package JavaClass9;

public class HWSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * From an array of integer elements find the largest number
		 */
		
		int[] num= {100, 10, 4000, 20, -100, 30, 4000, 50};
		int largestnum= num[0];
		
		for(int n:num) {
			if(n>largestnum) {
				largestnum=n;
			}
		}
		
		System.out.println(largestnum);
		System.out.println("------------------------------------");	
		
			largestnum=num[0];
		for (int i=1; i<num.length; i++) {
			if (num[i] > largestnum) {
				largestnum=num[i];
			}
		}
		System.out.println(largestnum);
		

	}

}
