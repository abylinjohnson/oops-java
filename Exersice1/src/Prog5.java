import java.util.*;

public class Prog5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		String val="";
		System.out.println("Enter a Number");
		num = in.nextInt();
		while (num > 0) {
			val = num%2 + val ;
			num = (int) num / 2;
		}
		System.out.println(val);
	}
}
