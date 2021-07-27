import java.util.Scanner;
public class Prog2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		char ch;
		String str2="";
		System.out.println("Enter the String");
		String str1 = sc.nextLine();
		l = str1.length();
		ch = str1.charAt(0);
		for(int i=0;i<l;i++) {
			if(str1.charAt(i)==ch && i!=0)
				str2 += '$';
			else
				str2 += str1.charAt(i);
			
		}
		System.out.println(str2);
	}
}
