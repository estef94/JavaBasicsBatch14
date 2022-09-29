package reviewclass2;
import java.util.*;

public class Recap {
	
	public static void main(String[] args) {
		
		
		//Explicit/narrowing/Manual
		//As we can't fit 129 in byte we will get wrong results
		short largerBox=129;
		byte smallerBox=(byte)largerBox;
		System.out.println(smallerBox);
		
		int largerBox1=129;
		short smallerBox2=(short)largerBox1;
		System.out.println(smallerBox2);
		
		//Implicit/Widening/Automatic
		short smallerbox3=45;
		long largerBox3=smallerbox3;
		System.out.println(largerBox3);
		
		
		
	}
}