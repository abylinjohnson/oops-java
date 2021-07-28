import java.util.Scanner;
public class Prog10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		String str,rev="";
		System.out.println("Enter the String Value:");
		str = sc.next();
		l = str.length();
		for(int i=l-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)==true)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT A PALINDROME");
	}
}
