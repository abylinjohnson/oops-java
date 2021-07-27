import java.util.Scanner;

public class Prog6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		int n, s, c = 0;
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the values of the array: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the number to be searched: ");
		s = sc.nextInt();
		for (int i = 0; i < n; i++)
			if (arr[i] == s)
				c = c + 1;
		if (c == 0)
			System.out.println("Number not found");
		else
			System.out.println("Number found " + c + " times");
	}
}
