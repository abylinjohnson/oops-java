import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] v = { 'a', 'e', 'i', 'o', 'u' };
		int vc = 0, n, flag = 0, dcc = 0;
		char arr[];
		char dcarr[];
		System.out.println("Enter the Size of the array: ");
		n = sc.nextInt();
		arr = new char[n];
		dcarr = new char[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next().charAt(0);
			for (int j = 0; j < 5; j++)
				if (arr[i] == v[j])
					vc = vc + 1;

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (arr[i] == arr[j]) {
						flag = 0;
						for (int k = 0; k < n; k++) {
							if (dcarr[k] == arr[i])
								flag = 1;

						}
						if (flag != 1) {
							dcarr[dcc] = arr[i];
							dcc = dcc + 1;

						}
					}
				}
			}
		}
		System.out.print("The Duplicate Characters are : ");
		for (int i = 0; i < dcc; i++)
			System.out.print(dcarr[i] + " ");
		System.out.println("");
		System.out.println("Number of vowels: " + vc);
		System.out.println("Number of consonants: " + (n-vc));
	}

}
