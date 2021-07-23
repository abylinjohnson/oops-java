import java.util.Scanner;
public class Prog1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Enter the Value :");
		num = in.nextInt();
		if(num % 2 != 0)
			System.out.println("Weird");
		else {
			if(num>=3 && num<=7)
				System.out.println("Not Weird");
			else if(num>7 && num<=22)
				System.out.println("Weird");
			else
				System.out.println("Not Weird");
		}
	}

}
