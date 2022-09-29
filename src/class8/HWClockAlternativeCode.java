package class8;

public class HWClockAlternativeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int hourone=0; hourone<3; hourone++) {
			
			for (int hourtwo=0; hourtwo<=9; hourtwo++) {
				
				for(int minone=0; minone<=5; minone++) {
					
					for(int mintwo=0; mintwo<=9; mintwo++) {
						
						if(hourone <=1 || hourtwo <4)
							System.out.println((hourone) + ""+ (hourtwo) + ":" + (minone)+ mintwo);
					}
				}
			}
		}
	}

}
