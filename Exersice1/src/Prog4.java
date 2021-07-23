import java.util.*;

public class Prog4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.print("*");
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (j > 0)
						System.out.print(j);
				}
				for (int k = i; k > 0; k--) {
					if (k > 0)
						System.out.print(k);
				}
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num - 1; i >= 0; i--) {
			System.out.print("*");
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (j > 0)
						System.out.print(j);
				}
				for (int k = i; k > 0; k--) {
					if (k > 0)
						System.out.print(k);
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
