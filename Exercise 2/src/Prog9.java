import java.util.Scanner;
import java.util.Random;

public class Prog9 {
	public static void main(String[] args) {
		Random random = new Random();
		random.setSeed(1234567890);
		Scanner in = new Scanner(System.in);
		int l;
		String password="";
		char[] small =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
		char[] capital= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I','J', 'K', 'L', 'M', 'N', 'O', 'P',  'Q','R','S','T', 'U', 'V','W', 'X', 'Y', 'Z'}; 
		int[] numbers = {0,1,2,3,4,5,6,7,8,9}; 
		System.out.println("Enter the Length of the Password");
		l = in.nextInt();
		for(int i=0;i<l;i++){
	
			switch(random.nextInt(3)) {
			case 0:
				password = password + small[random.nextInt(26)];
				break;
			case 1:
				password = password + capital[random.nextInt(26)];
				break;
			case 2:
				password = password + (char)(numbers[random.nextInt(10)]+'0');
				break;
			}
		}
		System.out.println(password);
		
	}
}
