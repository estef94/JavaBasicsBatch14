package Javaclass13;

public class StringDemo7 {

	public static void main(String[] args) {
		String str="I am always confused i was kidding";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		/*
		 * substring() gives you smaller string from a String we can start the starting
		 * part to this method and it will return us the subString from that index
		 */
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(5,11));
		int num=121232323;
		String numStr=String.valueOf(num).substring(1,3);
		System.out.println(numStr);
		num=Integer.parseInt(numStr);
		System.out.println();
		
	}

}
