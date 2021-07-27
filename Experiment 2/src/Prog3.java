import java.util.*;

public class Prog3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, uc = 0;
		int arr[];
		int uarr[];
		int c = -1;
		System.out.println("Enter the Length of the array: ");
		n = sc.nextInt();
		arr = new int[n];
		uarr = new int[n];
		System.out.println("Enter the values of the array: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if (arr[i] == arr[j])
					c = c + 1;
			if (c == 0) {
				uarr[uc] = arr[i];
				uc = uc + 1;
			}
			c = -1;
		}
		System.out.println("Count = " + uc);
		System.out.print("Unique Numbers are: ");
		for (int i = 0; i < uc; i++)
			System.out.print(uarr[i] + " ");

	}
}
