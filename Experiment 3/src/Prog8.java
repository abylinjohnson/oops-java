import java.util.Scanner;

public class Prog8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, c = 0, maxCount = 0, minCount = 999, mnc = 0, mxc = 0;
		String str, maxString = "", minString = "", wrd = "";
		System.out.println("Enter the String");
		str = sc.nextLine();
		str = str + " ";
		l = str.length();
		for (int i = 0; i < l; i++) {
			char ch = str.charAt(i);
			if (Character.isWhitespace(ch) == true) {
				if(c < minCount) {
					minString = wrd;
					minCount = c;
					c = 0;
					wrd = "";
					
				}
				if (c > maxCount) {
					maxString = wrd;
					maxCount = c;
					c = 0;
					wrd = "";
					
				} 
				
			} 
			else {
				wrd += ch;
				c = c + 1;
			}

		}
		System.out.println("Longest Word: "+maxString+ " Characters = "+maxCount);
		System.out.println("Shortest Word: "+minString+ " Characters = "+minCount );
	}
}
