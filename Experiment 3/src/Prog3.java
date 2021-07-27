import java.util.Scanner;
public class Prog3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int l,flag=0;
		System.out.println("Enter the String");
		str = sc.nextLine();
		l = str.length();
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++){
				if(i!=j){
					if(str.charAt(i)==str.charAt(j))
						flag = 1;
				}
			}
		}
		if(flag==1)
			System.out.println("NOT PERFECT");
		else 
			System.out.println("PERFECT");
	}
}
