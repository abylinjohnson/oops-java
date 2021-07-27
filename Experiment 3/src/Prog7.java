import java.util.Scanner;
public class Prog7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int l,vc=0,cc=0;
		System.out.println("Enter the String");
		str = sc.nextLine();
		l = str.length();
		char varr[],carr[];
		varr = new char[l];
		carr = new char[l];
		for(int i=0;i<l;i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				varr[vc] = ch;
				vc++;
				
			}
			else if(ch != ' ') {
				carr[cc] = ch;
				cc++;
			}
		}
		System.out.print("vowels are :");
		for(int i=0;i<vc;i++)
			System.out.print(varr[i]+", ");
		System.out.println("Total Vowels are: "+ vc);
		System.out.print("Consonants are :");
		for(int i=0;i<cc;i++)
			System.out.print(carr[i]+", ");
		System.out.println("Total Vowels are: "+ cc);
		
		
	}

}
