import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, c = 0;
		String str, searchWord, wrd = "";
		System.out.println("Enter the Sentence");
		str = sc.nextLine();
		System.out.println("Enter word to be searched:");
		searchWord = sc.next();
		l = str.length();
		for (int i = 0; i < l; i++) {
			char ch = str.charAt(i);
			if (Character.isWhitespace(ch) == true) {
				System.out.println(wrd);
				if (wrd.equals(searchWord))
					c += 1;
				wrd = "";
			} else
				wrd += ch;
		}
		if(c == 0)
			System.out.println("Word "+ searchWord +" is not present");
		else
			System.out.println("The given word '"+searchWord+"' is found " + c + " time(s)." );
	}
}
