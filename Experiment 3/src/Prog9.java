import java.util.*;
public class Prog9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int l,clc=0,slc=0;
		char clarr[], slarr[];
		System.out.println("Enter the value of the string:");
		str =sc.nextLine();
		l = str.length();
		clarr = new char[l];
		slarr = new char[l];
		for(int i=0;i<l;i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)==true)
				clarr[clc++] = ch;
			else if(Character.isLowerCase(ch)==true)
				slarr[slc++] = ch;
		}
		System.out.print("The total number of capital letters are "+clc+" they are : ");
		for(int i=0;i<clc;i++)
			System.out.print(clarr[i] +", ");
		System.out.println();
		System.out.print("The total number of small letters are "+slc+" they are : ");
		for(int i=0;i<slc;i++)
			System.out.print(slarr[i] +", ");
			
	}
}
