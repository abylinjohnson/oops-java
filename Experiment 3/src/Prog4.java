import java.util.Scanner;
public class Prog4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l,spaceCount =0,characterCount =0,wordCount =0,lineCount =0;
		String str;
		System.out.println("Enter the paragraph:");
		str = sc.nextLine();
		l = str.length();
		for(int i=0;i<l;i++){
			if(Character.isWhitespace(str.charAt(i)) == true)
				spaceCount += 1;
			else if(Character.isLetter(str.charAt(i)) == true)
				characterCount += 1;
			else if(str.charAt(i)=='.'||str.charAt(i)=='!'||str.charAt(i)=='?')
				lineCount += 1;
			
		}
		wordCount = spaceCount + 1;
		System.out.println("Number Of Characters: " +characterCount);
		System.out.println("Number Of Lines: " + lineCount);
		System.out.println("Number of Whitespaces: " +spaceCount);
		System.out.println("Number of Word: " + wordCount);
	}
}
