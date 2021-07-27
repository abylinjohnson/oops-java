import java.util.Scanner;
public class Prog1 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l,lc=0,dc=0;
		System.out.println("Enter the String");
		String str = sc.nextLine();
		l = str.length();
		for(int i=0;i<l;i++) {
			if(Character.isDigit(str.charAt(i))==true)
				dc += 1;
			else if(Character.isLetter(str.charAt(i))==true)
				lc +=1;
		}
		System.out.println("LETTERS "+lc);
		System.out.println("DIGITS "+ dc);
		
	}
}
