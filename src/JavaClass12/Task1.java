package JavaClass12;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the side of the array");
		int size=scanner.nextInt();
		int[] arr= new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Please Enter an int number");
			arr[i]=scanner.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		
	}

}

