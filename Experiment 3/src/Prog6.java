import java.util.Scanner;

public class Prog6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[];
		str = new String[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter the Name " + (i + 1) + " :");
			str[i] = sc.nextLine();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {

				if (str[i].compareTo(str[j]) < 0) {
					String temp;
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for (int i = 0; i < 6; i++)
			System.out.println(str[i]);
	}
}
