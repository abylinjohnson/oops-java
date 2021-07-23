import java.util.Scanner;

public class Prog2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, i, j;
		System.out.println("Enter the Number:");
		num = in.nextInt();
		for (i = 1; i <= num; i++) {
			for (j = num - i; j > 0; j--)
				System.out.print(" ");
			for (int k = i; k > 0; k--)
				System.out.print("* ");
			System.out.println();
		}

	}
}
